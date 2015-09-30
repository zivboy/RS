package com.ssm.service.core.impl;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import com.ssm.common.basedao.BaseDao;
import com.ssm.common.baseservice.BaseService;
import com.ssm.common.mybatis.Page;
import com.ssm.entity.DataControl;
import com.ssm.entity.DataControlCriteria;
import com.ssm.mapper.DataControlMapper;
import com.ssm.service.core.DataControlService;
import org.springframework.transaction.annotation.Transactional;

@Service("dataControlService")
@Transactional
@SuppressWarnings("unchecked")
public class DataControlServiceImpl extends BaseService implements DataControlService {

	@Override
	public void delete(Long id) {
		baseDao.getMapper(DataControlMapper.class).deleteByPrimaryKey(id);
	}

	@Override
	public List<DataControl> findAll(Page page) {
		DataControlCriteria criteria = new DataControlCriteria();
		
		if(page == null){
			return baseDao.getMapper(DataControlMapper.class).selectByExample(criteria);
		}
		
		return baseDao.selectByPage(BaseDao.SELECT_BY_EXAMPLE, criteria, page);
	}

	@Override
	public List<DataControl> findByExample(DataControl dataControl, Page page) {
		DataControlCriteria criteria = new DataControlCriteria();
		DataControlCriteria.Criteria cri = criteria.createCriteria();
		
		if(dataControl != null){
			if(StringUtils.isNotBlank(dataControl.getControl())){
				cri.andControlEqualTo(dataControl.getControl());
			}
			
			if(StringUtils.isNotBlank(dataControl.getName())){
				cri.andNameEqualTo(dataControl.getName());
			}
		}
		
		if(page == null){
			return baseDao.getMapper(DataControlMapper.class).selectByExample(criteria);
		}
		
		return baseDao.selectByPage(BaseDao.SELECT_BY_EXAMPLE, criteria, page);
	}

	@Override
	public DataControl get(Long id) {
		// TODO Auto-generated method stub
		return baseDao.getMapper(DataControlMapper.class).selectByPrimaryKey(id);
	}

	@Override
	public DataControl getByName(String name) {
		DataControlCriteria criteria = new DataControlCriteria();
		DataControlCriteria.Criteria cri = criteria.createCriteria();
		if(StringUtils.isNotBlank(name)){
			cri.andNameEqualTo(name);
		}
		
		List<DataControl> list = baseDao.getMapper(DataControlMapper.class).selectByExample(criteria);
		if(list != null && list.size() > 0){
			return list.get(0);
		}
		return null;
	}

	@Override
	public void saveOrUpdate(DataControl dataControl) {
		if(dataControl != null){
			if(dataControl.getId() != null){
				baseDao.getMapper(DataControlMapper.class).updateByPrimaryKeySelective(dataControl);
			}else{
				baseDao.getMapper(DataControlMapper.class).insert(dataControl);
			}
		}
		
	}

}
