package com.ssm.business.service;

import com.ssm.business.entity.Dictionary;
import com.ssm.common.mybatis.Page;

import java.util.List;

/**
 * Created by V on Sat Oct 17 10:30:06 GMT+08:00 2015.
 */

public interface DictionaryService {

    Page findByPage(Page page, Dictionary dictionary);

    List<Dictionary> findAll(Page page, Dictionary dictionary);

    int countByExample(Page page,Dictionary dictionary);

    void save(Dictionary dictionary);

    Dictionary get(int id);

    void update(Dictionary dictionary);

    void delete(int id);

    Dictionary findByKeyAndName(String name, String key);

    Dictionary findSubDicValue(String dicParentId, String dicName, String dicKey);

    Page findParentDicList(Page page, Dictionary dictionary);

    Page findChildrenDicList(Page page, Dictionary dictionary);

    List<Dictionary> findAllDicListForExport(Dictionary dictionary);

    int findMaxDicIdByName(String dicName);

    String findDicCodeByDicName(String dicName);
}

