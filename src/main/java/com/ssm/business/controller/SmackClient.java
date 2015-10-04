package com.ssm.business.controller;

import com.ssm.business.entity.Student;
import com.ssm.common.util.StringUtil;
import org.apache.commons.lang.StringUtils;
import org.jivesoftware.smack.*;
import org.jivesoftware.smack.chat.Chat;
import org.jivesoftware.smack.chat.ChatManager;
import org.jivesoftware.smack.chat.ChatManagerListener;
import org.jivesoftware.smack.chat.ChatMessageListener;
import org.jivesoftware.smack.filter.StanzaFilter;
import org.jivesoftware.smack.packet.Message;
import org.jivesoftware.smack.packet.Presence;
import org.jivesoftware.smack.packet.Stanza;
import org.jivesoftware.smack.roster.Roster;
import org.jivesoftware.smack.roster.RosterListener;
import org.jivesoftware.smack.tcp.XMPPTCPConnection;
import org.jivesoftware.smack.tcp.XMPPTCPConnectionConfiguration;
import org.jivesoftware.smackx.muc.MultiUserChat;
import org.jivesoftware.smackx.muc.MultiUserChatManager;
import org.jivesoftware.smackx.xdata.Form;
import org.jivesoftware.smackx.xdata.FormField;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by  moxz
 * User: 224911261@qq.com
 * 2015/9/29-20:54
 * RecruitSystem.com.ssm.business.controller
 */
public class SmackClient {

    private static final String MUC_NAME = "@muc.www.imakehabits.com";

    public static void countPeople(Roster r){
        System.out.println("在线人数变为：" + r.getEntryCount());
    }

    public static void go(){
        try{
            //对连接的配置
            XMPPTCPConnectionConfiguration.Builder builder = XMPPTCPConnectionConfiguration.builder();
            builder.setUsernameAndPassword("habit", "habit");
            builder.setServiceName("www.imakehabits.com");
            builder.setHost("www.imakehabits.com");
            builder.setPort(5222);
            //不加这行会报错，因为没有证书
            builder.setSecurityMode(ConnectionConfiguration.SecurityMode.disabled);
            builder.setDebuggerEnabled(true);
            XMPPTCPConnectionConfiguration config = builder.build();

            //建立连接并登陆
            AbstractXMPPConnection c = new XMPPTCPConnection(config);

            c.addPacketSendingListener(new StanzaListener(){
                @Override
                public void processPacket(Stanza st)
                        throws SmackException.NotConnectedException {
                    System.out.println("in StanzaListener:" + st.getFrom());
                }
            }, new StanzaFilter(){
                @Override
                public boolean accept(Stanza st) {
                    System.out.println("in StanzaFilter:" + st.getFrom());
                    return false;
                }
            });

            c.connect();
            c.login();

            final Roster roster = Roster.getInstanceFor(c);
            Presence p = roster.getPresence("live@www.imakehabits.com");
            System.out.println(p.getType());
            roster.addRosterListener(new RosterListener() {
                public void entriesAdded(Collection<String> arg0) {countPeople(roster);}
                public void entriesDeleted(Collection<String> addresses) {countPeople(roster);}
                public void entriesUpdated(Collection<String> addresses) {countPeople(roster);}
                public void presenceChanged(Presence presence) {countPeople(roster);}
            });

//            //设置是否在线状态，和状态说明
//            Presence presence = new Presence(Presence.Type.unavailable);
//            presence.setStatus("Gone fishing");
//            c.sendStanza(presence);

            //会话管理者的建立和配置监听
            ChatManager chatmanager = ChatManager.getInstanceFor(c);
            chatmanager.addChatListener(new ChatManagerListener() {
                @Override
                public void chatCreated(Chat cc, boolean bb) {
                    //当收到来自对方的消息时触发监听函数
                    cc.addMessageListener(new ChatMessageListener() {
                        @Override
                        public void processMessage(Chat cc, Message mm) {
                            System.out.println(mm.getBody());
                        }
                    });
                }
            });

            //建立会话
            Chat chat = chatmanager.createChat("live@www.imakehabits.com");
            chat.getThreadID();

            //发消息
            Message msg = new Message();
            msg.setBody("hello!");
            chat.sendMessage(msg);



            String name="test_group_chat";
            String desc = "the test group chat";
            String nick="test";

            try {

                //获取房间管理对象
                MultiUserChatManager manager = MultiUserChatManager.getInstanceFor(c);
                //创建一个房间
                MultiUserChat muc = manager.getMultiUserChat("roomTest@"+MUC_NAME);
                muc.createOrJoin(nick);

                // User1 (which is the room owner) configures the room as a moderated room
                Form form = muc.getConfigurationForm();

                Form answerForm = form.createAnswerForm();
                //向提交的表单添加默认答复,获取房间的默认设置菜单
                for (FormField field : form.getFields()) {
                    if (!FormField.Type.hidden.name().equals(field.getType()) && field.getVariable() != null) {
                        answerForm.setDefaultAnswer(field.getVariable());
                    }
                }

                //muc#
                //房间名称
                //answerForm.setAnswer(FormField.FORM_TYPE, "http://jabber.org/protocol/muc#roomconfig");
                //设置房间名称
                answerForm.setAnswer("muc#roomconfig_roomname", name);
                //设置房间描述
                answerForm.setAnswer("muc#roomconfig_roomdesc", desc);
                //是否允许修改主题
                answerForm.setAnswer("muc#roomconfig_changesubject", true);

                //设置房间最大用户数
                List<String> maxusers = new ArrayList<String>();
                maxusers.add("100");
                answerForm.setAnswer("muc#roomconfig_maxusers", maxusers);


                List<String> cast_values = new ArrayList<String>();
                cast_values.add("moderator");
                cast_values.add("participant");
                cast_values.add("visitor");
                //answerForm.setAnswer("muc#roomconfig_presencebroadcast", cast_values);
                //设置为公共房间
                answerForm.setAnswer("muc#roomconfig_publicroom", true);
                //设置为永久房间
                answerForm.setAnswer("muc#roomconfig_persistentroom", true);
                //允许修改昵称
                //answerForm.setAnswer("x-muc#roomconfig_canchangenick", true);
                //允许用户登录注册房间
                //answerForm.setAnswer("x-muc#roomconfig_registration", true);


                muc.sendConfigurationForm(answerForm);
                muc.join(nick);

            } catch (XMPPException e) {
                e.printStackTrace();
            } catch (SmackException.NoResponseException e) {
                e.printStackTrace();
            } catch (SmackException.NotConnectedException e) {
                e.printStackTrace();
            } catch (SmackException e) {
                e.printStackTrace();
            }

            try {
                sendRoomMessage(c, "roomTest","Bei呗", "hello world");
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }

            while(true);

        }catch(Exception e){
            e.printStackTrace();
        }
    }


    public static void sendRoomMessage(XMPPConnection connection,String roomName,String niceName,String msg) throws Exception {
        MultiUserChatManager multiUserChatManager = MultiUserChatManager.getInstanceFor(connection);
        MultiUserChat muc = multiUserChatManager.getMultiUserChat(roomName+MUC_NAME);
        muc.createOrJoin(StringUtils.isNotBlank(niceName)?niceName:connection.getUser());
        muc.sendMessage(msg);
    }

  /*  public static void main(String[] args) {
        go();
    } */
    public static void main(String[] args) {
        Student student = new Student();
        try {
            Student.class.getMethod("set" + StringUtil.firstCharacterToUpper("name"), String.class).invoke(student, String.valueOf("123"));
            System.out.println(student.getName());
        }
        catch (Exception e)
        {

        }
    }
}
