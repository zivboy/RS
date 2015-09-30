/**
 *
 */
package com.ssm.shiro;

import org.apache.shiro.subject.Subject;

import com.ssm.entity.User;

/**
 * @description:
 * @version 1.0
 * @author IMANON
 * @createDate 2014-1-21;下午10:37:56
 */
public abstract class SecurityUtils {

    public static User getLoginUser() {
        return getShiroUser().getUser();
    }

    public static ShiroUser getShiroUser() {
        Subject subject = getSubject();
        ShiroUser shiroUser = (ShiroUser)subject.getPrincipal();

        return shiroUser;
    }

    public static Subject getSubject() {
        return org.apache.shiro.SecurityUtils.getSubject();
    }
}
