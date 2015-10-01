package com.ssm.business.service.impl;


import com.ssm.business.entity.Item;
import com.ssm.business.entity.ItemCriteria;
import com.ssm.business.mapper.ItemMapper;
import com.ssm.business.service.ItemService;
import com.ssm.common.basedao.BaseDao;
import com.ssm.common.baseservice.BaseService;
import com.ssm.common.mybatis.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by V on Tue Sep 22 23:55:11 GMT+08:00 2015.
 */
@Service("ItemService")
@Transactional
@SuppressWarnings("unchecked")
public class ItemServiceImpl  extends BaseService implements ItemService {


    @Override
    public Page findByPage(Page page, Item item) {
        page.setCount(countByExample(page,item));
        List<Item> list= baseDao.selectByPage("com.ssm.business.mapper.ItemMapper." + BaseDao.SELECT_BY_EXAMPLE, getCriteria(page, item), page);;
        if(list!=null)
            return page.setRows(list);
        else
            return null;
    }
    
    @Override
    public List<Item> findAll(Page page, Item item) {
        return baseDao.selectList("com.ssm.business.mapper.ItemMapper." + BaseDao.SELECT_BY_EXAMPLE, getCriteria(page, item));
    }

    @Override
    public int countByExample(Page page, Item item) {
        return baseDao.getMapper(ItemMapper.class).countByExample(getCriteria(page,item));
    }

    public ItemCriteria getCriteria(Page page,Item item)
    {
        ItemCriteria criteria = new ItemCriteria();
        ItemCriteria.Criteria cri = criteria.createCriteria();
        if (item != null) {
                
        }
        if(page != null && page.getSort() != null && page.getOrder() != null){
            criteria.setOrderByClause(page.getSort() + " " + page.getOrder());
        }
        return criteria;
    }

    @Override
    public void save(Item item) {
        baseDao.getMapper(ItemMapper.class).insertSelective(item);
    }


    @Override
    public int saveBatch(List<Item> list) {
        return baseDao.updateBatch(Item.class,"INSERT",list);
    }


    @Override
    public Item get(int id) {
        return baseDao.getMapper(ItemMapper.class).selectByPrimaryKey(id);
    }

    @Override
    public void update(Item item) {
        baseDao.getMapper(ItemMapper.class).updateByPrimaryKeySelective(item);
    }

    @Override
    public void delete(int id) {
        baseDao.getMapper(ItemMapper.class).deleteByPrimaryKey(id);
    }
}

