package com.ssm.service.core.impl;

import java.util.List;

import com.ssm.common.basedao.BaseDao;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.ssm.common.baseservice.BaseService;
import com.ssm.common.mybatis.Page;
import com.ssm.entity.Role;
import com.ssm.entity.RoleCriteria;
import com.ssm.mapper.RoleMapper;
import com.ssm.service.core.RolePermissionService;
import com.ssm.service.core.RoleService;
import org.springframework.transaction.annotation.Transactional;

@Service("roleService")
@Transactional
@SuppressWarnings("unchecked")
@Cacheable(value="Role")
public class RoleServiceImpl extends BaseService implements RoleService {
	
	@Autowired
	private RolePermissionService rolePermissionService;
	
	@Override
	public void delete(Long id) {
		baseDao.getMapper(RoleMapper.class).deleteByPrimaryKey(id);
//		shiroRealm.clearAllCachedAuthorizationInfo();
	}

    @Override
    public Page findByPage(Page page, Role role) {
        page.setCount(find(null,role).size());
        return page.setRows(find(page,role));
    }

    public  RoleCriteria getCriteria(Page page,Role role)
    {
        RoleCriteria criteria = new RoleCriteria();
        RoleCriteria.Criteria cri = criteria.createCriteria();
        if (role != null) {
            if(StringUtils.isNotBlank(role.getDescription())){
                cri.andDescriptionLike(role.getDescription());
            }
            if(StringUtils.isNotBlank(role.getName())){
                cri.andNameEqualTo(role.getName());
            }
        }
        if(page != null && page.getSort() != null && page.getOrder() != null){
            criteria.setOrderByClause(page.getSort() + " " + page.getOrder());
        }
        return criteria;
    }



    @Override
	public List<Role> find(Page page, Role role) {
        if(page == null)
            return baseDao.getMapper(RoleMapper.class).selectByExample(getCriteria(page,role));
        else {
            List<Role> list = baseDao.selectByPage("com.ssm.mapper.RoleMapper." + BaseDao.SELECT_BY_EXAMPLE, getCriteria(page, role), page);
            return  list;
        }
	}
	
	public List<Role> findAll(){
		RoleCriteria criteria = new RoleCriteria();
		return baseDao.getMapper(RoleMapper.class).selectByExample(criteria);
	}

	@Override
	public Role get(Long id) {
		Role role = baseDao.getMapper(RoleMapper.class).selectByPrimaryKey(id);
		if(role != null){
			role.setRolePermissions(rolePermissionService.findByRoleId(role.getId()));
		}
		return role;
	}

	@Override
	public void save(Role role) {
		// TODO Auto-generated method stub
        baseDao.getMapper(RoleMapper.class).insert(role);
	}

	@Override
	public void update(Role role) {
		// TODO Auto-generated method stub

        baseDao.getMapper(RoleMapper.class).updateByPrimaryKeySelective(role);
	}

}
