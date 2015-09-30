package com.ssm.service.core;

import java.util.List;

import com.ssm.common.mybatis.Page;
import com.ssm.entity.RolePermission;


/** 
 * @description: 角色授权操作关联
 * @version 1.0
 * @author IMANON
 * @createDate 2014-1-11;下午02:12:59
 */
public interface RolePermissionService {

	void save(RolePermission rolePermission);
	
	RolePermission get(Long id);

	void update(RolePermission rolePermission);
	
	void delete(Long id);

    void delete(RolePermission rolePermission);

	List<RolePermission> findByRoleId(Long roleId);

	List<RolePermission> findByRoleId(Page page,Long roleId);

	void save(Iterable<RolePermission> entities);
	
	void delete(Iterable<RolePermission> entities);
	
}
