package com.ssm.service.core;

import java.util.List;

import com.ssm.common.mybatis.Page;
import com.ssm.entity.LogEntity;
import com.ssm.log.LogLevel;


/** 
 * @description: 登录日志
 * @version 1.0
 * @author IMANON
 * @createDate 2014-1-11;下午02:16:30
 */
public interface LogEntityService {

void save(LogEntity logEntity);
	
	LogEntity get(Long id);
	
	void update(LogEntity logEntity);
	
	void delete(Long id);
	
	List<LogEntity> findByLogLevel(LogLevel logLevel, Page page);
	
	List<LogEntity> findAll();
	
	List<LogEntity> findByExample(LogEntity logEntity, Page page);
	
}
