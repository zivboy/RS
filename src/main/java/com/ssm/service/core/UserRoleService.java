package com.ssm.service.core;

import java.util.List;

import com.ssm.entity.UserRole;


/** 
 * @description: 用户角色
 * @version 1.0
 * @author IMANON
 * @createDate 2014-1-11;下午02:10:20
 */
public interface UserRoleService {

	UserRole get(Long id);
	
	/**
	 * 根据userId，找到已分配的角色。
	 * 描述
	 * @param userId
	 * @return
	 */
	List<UserRole> find(Long userId);

	void save(UserRole userRole);

	void delete(Long userRoleId);

    List<UserRole> find(UserRole userRole);
	
}
