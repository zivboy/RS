package com.ssm.service.core;

import java.util.List;

import com.ssm.entity.OrganizationRole;


/** 
 * @description: 组织角色
 * @version 1.0
 * @author IMANON
 * @createDate 2014-1-11;下午02:18:03
 */
public interface OrganizationRoleService {

	OrganizationRole get(Long id);
	
	/**
	 * 根据organizationId，找到已分配的角色。
	 * 描述
	 * @param organizationId
	 * @return
	 */
	List<OrganizationRole> find(Long organizationId);

	void save(OrganizationRole organizationRole);

	void delete(Long organizationRoleId);
	
}
