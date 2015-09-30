package com.ssm.service.core;

import java.util.List;

import com.ssm.common.mybatis.Page;
import com.ssm.entity.Role;

/** 
 * @description: 角色管理
 * @version 1.0
 * @author IMANON
 * @createDate 2014-1-11;下午02:11:00
 */
public interface RoleService {


    Page findByPage(Page page, Role role);

	List<Role> find(Page page, Role role);
	
	List<Role> findAll();
	
	void save(Role role);

	Role get(Long id);

	void update(Role role);

	void delete(Long id);
}
