package com.ssm.service.core;

import java.util.List;

import com.ssm.common.mybatis.Page;
import com.ssm.entity.Organization;
import com.ssm.exception.ServiceException;

/** 
 * @description: 组织
 * @version 1.0
 * @author IMANON
 * @createDate 2014-1-11;下午02:15:24
 */
public interface OrganizationService {

	List<Organization> find(Long parentId, String name, Page page);
	List<Organization> findByParentId(Long parentId);

    List<Organization> findAll();

    Page findByPage(Page page,Organization organization);

	Organization getTree();

	void save(Organization organization);

	Organization get(Long id);

	void update(Organization organization);

	void delete(Long id) throws ServiceException;
	
	Organization getByName(String name);

    int countByExample(Page page, Organization organization);

}
