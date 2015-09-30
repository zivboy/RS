package com.ssm.service.core.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ssm.common.baseservice.BaseService;
import com.ssm.entity.OrganizationRole;
import com.ssm.entity.OrganizationRoleCriteria;
import com.ssm.mapper.OrganizationRoleMapper;
import com.ssm.service.core.OrganizationRoleService;
import com.ssm.service.core.RoleService;
import org.springframework.transaction.annotation.Transactional;

@Service("organizationRoleService")
@Transactional
@SuppressWarnings("unchecked")
public class OrganizationRoleServiceImpl extends BaseService implements OrganizationRoleService {

	@Resource(name="roleService")
	private RoleService roleService;
	
	@Override
	public void delete(Long organizationRoleId) {
		baseDao.getMapper(OrganizationRoleMapper.class).deleteByPrimaryKey(organizationRoleId);
	}

	@Override
	public List<OrganizationRole> find(Long organizationId) {
		OrganizationRoleCriteria criteria = new OrganizationRoleCriteria();
		OrganizationRoleCriteria.Criteria cri = criteria.createCriteria();
		if(organizationId != null){
			cri.andOrganizationIdEqualTo(organizationId);
		}
		
		List<OrganizationRole> list = baseDao.getMapper(OrganizationRoleMapper.class).selectByExample(criteria);
		for(OrganizationRole or : list){
			if(or.getRoleId() != null){
				or.setRole(roleService.get(or.getRoleId()));
			}
		}
		
		return list;
	}

	@Override
	public OrganizationRole get(Long id) {
		// TODO Auto-generated method stub
		return baseDao.getMapper(OrganizationRoleMapper.class).selectByPrimaryKey(id);
	}

	@Override
	public void save(OrganizationRole organizationRole) {
		baseDao.getMapper(OrganizationRoleMapper.class).insert(organizationRole);

	}

}
