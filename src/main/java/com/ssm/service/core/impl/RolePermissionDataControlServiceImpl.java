package com.ssm.service.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ssm.common.basedao.BaseDao;
import com.ssm.common.baseservice.BaseService;
import com.ssm.common.mybatis.Page;
import com.ssm.entity.RolePermissionDataControl;
import com.ssm.entity.RolePermissionDataControlCriteria;
import com.ssm.mapper.DataControlMapper;
import com.ssm.mapper.RolePermissionDataControlMapper;
import com.ssm.service.core.RolePermissionDataControlService;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@SuppressWarnings("unchecked")
@Service("rolePermissionDataControlService")
public class RolePermissionDataControlServiceImpl extends BaseService implements 
		RolePermissionDataControlService {

	
	@Override
	public void delete(Long id) {
		baseDao.getMapper(RolePermissionDataControlMapper.class).deleteByPrimaryKey(id);

	}

	@Override
	public void delete(Iterable<RolePermissionDataControl> entities) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<RolePermissionDataControl> findAll(Page page) {
		RolePermissionDataControlCriteria criteria = new RolePermissionDataControlCriteria();
		RolePermissionDataControlCriteria.Criteria cri = criteria.createCriteria();
		if(page == null){
			return baseDao.getMapper(RolePermissionDataControlMapper.class).selectByExample(criteria);
		}
		return baseDao.selectByPage(BaseDao.SELECT_BY_EXAMPLE, criteria, page);
	}

	@Override
	public List<RolePermissionDataControl> findByExample(
			RolePermissionDataControl rolePermissionDataControl, Page page) {
		RolePermissionDataControlCriteria criteria = new RolePermissionDataControlCriteria();
		RolePermissionDataControlCriteria.Criteria cri = criteria.createCriteria();
		
		if(rolePermissionDataControl != null){
			if(rolePermissionDataControl.getDataControlId() != null){
				cri.andDataControlIdEqualTo(rolePermissionDataControl.getDataControlId());
			}
			
			if(rolePermissionDataControl.getRolePermissionId() != null){
				cri.andRolePermissionIdEqualTo(rolePermissionDataControl.getRolePermissionId());
			}
		}
		
		if(page == null){
			return baseDao.getMapper(RolePermissionDataControlMapper.class).selectByExample(criteria);
		}
		return baseDao.selectByPage(BaseDao.SELECT_BY_EXAMPLE, criteria, page);
	}

	@Override
	public List<RolePermissionDataControl> findByRoleId(Long roleId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<RolePermissionDataControl> findByRolePermissionId(
			Long rolePermissionId) {
		RolePermissionDataControlCriteria criteria = new RolePermissionDataControlCriteria();
		RolePermissionDataControlCriteria.Criteria cri = criteria.createCriteria();
		if(rolePermissionId != null){
			cri.andRolePermissionIdEqualTo(rolePermissionId);
		}
		
		List<RolePermissionDataControl> list = new ArrayList<RolePermissionDataControl>();
		list = baseDao.getMapper(RolePermissionDataControlMapper.class).selectByExample(criteria);
		for(RolePermissionDataControl rpdc:list){
			if(rpdc.getDataControlId() != null){
				rpdc.setDataControl(baseDao.getMapper(DataControlMapper.class).selectByPrimaryKey(rpdc.getDataControlId()));
			}
		}
		return list;
	}

	@Override
	public RolePermissionDataControl get(Long id) {
		// TODO Auto-generated method stub
		return baseDao.getMapper(RolePermissionDataControlMapper.class).selectByPrimaryKey(id);
	}

	@Override
	public void save(Iterable<RolePermissionDataControl> entities) {
		// TODO Auto-generated method stub

	}

	@Override
	public void saveOrUpdate(RolePermissionDataControl rolePermissionDataControl) {
		if(rolePermissionDataControl.getId() != null){
			baseDao.getMapper(RolePermissionDataControlMapper.class).updateByPrimaryKeySelective(rolePermissionDataControl);
		}else{
			baseDao.getMapper(RolePermissionDataControlMapper.class).insertSelective(rolePermissionDataControl);
		}

	}

}
