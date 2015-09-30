package com.ssm.common.mybatis;

import java.util.List;

import org.apache.ibatis.session.RowBounds;

public class Page extends RowBounds{
    
    public Page(int pageNo, int pageSize) {
        super(pageNo * pageSize, pageSize);
    }
    
    public Page(int pageNo, int pageSize,String sort,String order) {
    	super(pageNo ,  pageSize);
    	this.sort=sort;
    	this.order=order;
    }
    
    private Integer count;
    private String  sort;
    private String order;
    private List rows;
    
    /**
     * @return the count
     */
    public Integer getCount() {
    	 return count==null?0:count;
    }
    
    /**
     * @param count the count to set
     */
    public void setCount(Integer count) {
        this.count = count;
    }
    
	public List getRows() {
		return rows;
	}

	public Page setRows(List rows) {
		this.rows = rows;
		return this;
	}
	public String getSort() {
		return sort;
	}
	public void setSort(String sort) {
		this.sort = sort;
	}
	public String getOrder() {
		return order;
	}
	public void setOrder(String order) {
		this.order = order;
	}
}
