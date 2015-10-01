package com.ssm.business.service;

import com.ssm.business.entity.Item;
import com.ssm.common.mybatis.Page;

import java.util.List;

/**
 * Created by  moxz
 * User: 224911261@qq.com
 * 2015/9/26-16:48
 * RecruitSystem.com.ssm.business.service
 */
public interface ItemService {

    Page findByPage(Page page, Item item);

    List<Item> findAll(Page page, Item item);

    int countByExample(Page page, Item item);

    void save(Item item);

    int saveBatch(List<Item> list);

    Item get(int id);

    void update(Item item);

    void delete(int id);
}
