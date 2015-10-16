package com.ssm.service.core.impl;

import com.ssm.common.basedao.BaseDao;
import com.ssm.common.baseservice.BaseService;
import com.ssm.common.mybatis.Page;
import com.ssm.entity.RolePermission;
import com.ssm.entity.RolePermissionCriteria;
import com.ssm.mapper.RolePermissionMapper;
import com.ssm.service.core.PermissionService;
import com.ssm.service.core.RolePermissionDataControlService;
import com.ssm.service.core.RolePermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service("rolePermissionService")
@Transactional
public class RolePermissionServiceImpl extends BaseService implements RolePermissionService {

	@Autowired
	private PermissionService permissionService;
	
	@Autowired
	private RolePermissionDataControlService rolePermissionDataControlService;
	
	@Override
	public void delete(Long id) {
		baseDao.getMapper(RolePermissionMapper.class).deleteByPrimaryKey(id);
	}

    @Override
    public void delete(RolePermission rolePermission) {
        RolePermissionCriteria criteria = new RolePermissionCriteria();
        RolePermissionCriteria.Criteria cri = criteria.createCriteria();

        if(null != rolePermission.getRoleId()){
            cri.andRoleIdEqualTo(rolePermission.getRoleId());
        }
        baseDao.getMapper(RolePermissionMapper.class).deleteByExample(criteria);
    }

    @Override
	public void delete(Iterable<RolePermission> entities) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<RolePermission> findByRoleId(Long roleId) {
		RolePermissionCriteria criteria = new RolePermissionCriteria();
		RolePermissionCriteria.Criteria cri = criteria.createCriteria();
		if(roleId != null){
			cri.andRoleIdEqualTo(roleId);
		}
		List<RolePermission> list;
		list = baseDao.getMapper(RolePermissionMapper.class).selectByExample(criteria);
		for(RolePermission rp:list){
			if(rp.getPermissionId() != null){
				rp.setPermission(permissionService.get(rp.getPermissionId()));
				rp.setRolePermissionDataControls(rolePermissionDataControlService.findByRolePermissionId(rp.getPermissionId()));
			}
		}
		return list;
	}

	@SuppressWarnings("unchecked")
    @Override
    public List<RolePermission> findByRoleId(Page page,Long roleId) {
        RolePermissionCriteria criteria = new RolePermissionCriteria();
        RolePermissionCriteria.Criteria cri = criteria.createCriteria();
        if(roleId != null){
            cri.andRoleIdEqualTo(roleId);
        }

        if(page != null && page.getSort() != null && page.getOrder() != null){
            criteria.setOrderByClause(page.getSort() + " " + page.getOrder());
        }

        List<RolePermission> list = new ArrayList<>();

        if(page == null){
            list = baseDao.getMapper(RolePermissionMapper.class).selectByExample(criteria);
        }
        else {
			try {
				list = (List<RolePermission>)baseDao.selectByPage("com.ssm.mapper.RolePermissionMapper." + BaseDao.SELECT_BY_EXAMPLE, criteria, page);

				for(RolePermission rp:list)
					if (null != rp.getPermissionId()) {
						rp.setPermission(permissionService.get(rp.getPermissionId()));
						rp.setRolePermissionDataControls(rolePermissionDataControlService.findByRolePermissionId(rp.getPermissionId()));
					}
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
        }
        return list;
    }

	@Override
	public RolePermission get(Long id) {
		// TODO Auto-generated method stub
		return baseDao.getMapper(RolePermissionMapper.class).selectByPrimaryKey(id);
	}

    @Override
	public void save(RolePermission rolePermission) {
		baseDao.getMapper(RolePermissionMapper.class).insertSelective(rolePermission);

	}

	@Override
	public void save(Iterable<RolePermission> entities) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(RolePermission rolePermission) {
		baseDao.getMapper(RolePermissionMapper.class).updateByPrimaryKeySelective(rolePermission);

	}

}
