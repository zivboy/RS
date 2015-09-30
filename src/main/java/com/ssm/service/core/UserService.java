package com.ssm.service.core;

import com.ssm.common.mybatis.Page;
import com.ssm.entity.User;
import com.ssm.exception.ExistedException;
import com.ssm.exception.ServiceException;

import java.util.List;


/** 
 * @description: 用户管理
 * @version 1.0
 * @author IMANON
 * @createDate 2014-1-11;下午01:14:07
 */
public interface UserService {

	User get(String username);
	
	List<User> find(User user);

	void update(User user);
	
	void updatePwd(User user, String newPwd) throws ServiceException;
	
	void resetPwd(User user, String newPwd);

	void save(User user) throws ExistedException;

	User get(Long id);

	/**
	 * @param id 删除
	 * @throws ServiceException
	 */
	void delete(Long id) throws ServiceException;

    void delete(User user) throws ServiceException;

	Page findByPage(Page page,User user);
	
	/**
	 * 按用户名
	 * @param username
	 * @return
	 */
	public User getByUsername(String username);
	/**
	 * 按邮箱
	 * @param email
	 * @return
	 */
	public User getByEmail(String email);
}
