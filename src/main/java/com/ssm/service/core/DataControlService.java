package com.ssm.service.core;

import java.util.List;

import com.ssm.common.mybatis.Page;
import com.ssm.entity.DataControl;


public interface DataControlService {

	DataControl get(Long id);
	
	DataControl getByName(String name);

	void saveOrUpdate(DataControl dataControl);

	void delete(Long id);
	
	List<DataControl> findAll(Page page);
	
	List<DataControl> findByExample(DataControl dataControl, Page page);
}
