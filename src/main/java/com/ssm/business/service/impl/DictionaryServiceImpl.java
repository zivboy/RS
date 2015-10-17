package com.ssm.business.service.impl;

import com.ssm.business.entity.Dictionary;
import com.ssm.business.entity.DictionaryCriteria;
import com.ssm.business.mapper.DictionaryMapper;
import com.ssm.business.service.DictionaryService;
import com.ssm.common.basedao.BaseDao;
import com.ssm.common.baseservice.BaseService;
import com.ssm.common.mybatis.Page;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by V on Sat Oct 17 10:30:06 GMT+08:00 2015.
 */
@Service("DictionaryService")
@Transactional
@SuppressWarnings("unchecked")
public class DictionaryServiceImpl  extends BaseService implements DictionaryService {


    @Override
    public Page findByPage(Page page, Dictionary dictionary) {
        page.setCount(countByExample(page,dictionary));
        List<Dictionary> list= baseDao.selectByPage("com.ssm.business.mapper.DictionaryMapper."+BaseDao.SELECT_BY_EXAMPLE, getCriteria(page,dictionary),page);
        if(list!=null)
            return page.setRows(list);
        else
            return null;
    }
    
    @Override
    public List<Dictionary> findAll(Page page, Dictionary dictionary) {
        return baseDao.selectList("com.ssm.business.mapper.DictionaryMapper."+BaseDao.SELECT_BY_EXAMPLE, getCriteria(page,dictionary));
    }

    @Override
    public int countByExample(Page page, Dictionary dictionary) {
        return baseDao.getMapper(DictionaryMapper.class).countByExample(getCriteria(page,dictionary));
    }


    public DictionaryCriteria getCriteria(Page page,Dictionary dictionary)
    {
        DictionaryCriteria criteria = new DictionaryCriteria();
        DictionaryCriteria.Criteria cri = criteria.createCriteria();
        if (dictionary != null) {
            if (StringUtils.isNotBlank(dictionary.getState())) {
                cri.andStateEqualTo(dictionary.getState());
            }
            else
            {
                cri.andStateEqualTo("A");
            }

            if (StringUtils.isNotBlank(dictionary.getDicName())) {
                cri.andDicNameLike("%"+dictionary.getDicName()+"%");
            }
            if (StringUtils.isNotBlank(dictionary.getDicKey())) {
                cri.andDicKeyEqualTo(dictionary.getDicKey());
            }
            if (StringUtils.isNotBlank(dictionary.getDicCode())) {
                cri.andDicCodeLike("%"+dictionary.getDicCode()+"%");
            }
            if (dictionary.getDicParentId()!=null) {
                cri.andDicParentIdEqualTo(dictionary.getDicParentId());
            }
            if (dictionary.getDicId()!=null) {
                cri.andDicIdEqualTo(dictionary.getDicId());
            }
        }
        if(page != null && page.getSort() != null && page.getOrder() != null){
            criteria.setOrderByClause(page.getSort() + " " + page.getOrder());
        }
        return criteria;
    }
    public Dictionary findByKeyAndName(String dicKey,String dicName){
        return baseDao.getMapper(DictionaryMapper.class).selectByKeyAndName(dicKey,dicName);
    }

    public Dictionary findSubDicValue(String dicParentId,String dicName,String dicKey){
        Dictionary dic = new Dictionary();
        Dictionary resultDic = new Dictionary();
        dic.setDicParentId(Integer.parseInt(dicParentId));
        dic.setDicName(dicName);
        dic.setDicKey(dicKey);
        List<Dictionary> dicList = findAll(null,dic);
        if (dicList != null && dicList.size()>0){
            resultDic = dicList.get(0);
        }
        return resultDic;
    }

    /**
     * 查找父级条目
     * @author maoni 2014.10.25
     * @param page
     * @param dictionary
     * @return
     */
    @Override
    public Page findParentDicList(Page page,Dictionary dictionary){
        page.setCount(findParentAll(page,dictionary).size());
        return page.setRows(baseDao.selectByPage("com.ssm.business.mapper.DictionaryMapper.findParent", getCriteria(page,dictionary),page));
    }

    /**
     * 查找子级条目
     * @author maoni 2014.10.25
     * @param page
     * @param dictionary
     * @return
     */
    @Override
    public Page findChildrenDicList(Page page,Dictionary dictionary){
        page.setCount(findChildrenAll(page,dictionary).size());
        return page.setRows(baseDao.selectByPage("com.ssm.business.mapper.DictionaryMapper.findChildren", getCriteria(page,dictionary),page));
    }

    /**
     * @param page
     * @param dictionary
     * @return
     */
    public List<Dictionary> findParentAll(Page page, Dictionary dictionary) {
        return baseDao.selectList("com.ssm.business.mapper.DictionaryMapper.findParent", getCriteria(page,dictionary));
    }

    /**
     * @param page
     * @param dictionary
     * @return
     */
    public List<Dictionary> findChildrenAll(Page page, Dictionary dictionary) {
        return baseDao.selectList("com.ssm.business.mapper.DictionaryMapper.findChildren", getCriteria(page,dictionary));
    }

    /**
     * 导出时执行全部查询
     * @param dictionary
     * @author maoni
     * @return
     */
    @Override
    public List<Dictionary> findAllDicListForExport(Dictionary dictionary) {
        return baseDao.getMapper(DictionaryMapper.class).findAllDicListForExport(dictionary);
    }


    @Override
    public void save(Dictionary dictionary) {
        baseDao.getMapper(DictionaryMapper.class).insertSelective(dictionary);
    }

    @Override
    public Dictionary get(int id) {
        return baseDao.getMapper(DictionaryMapper.class).selectByPrimaryKey(id);
    }


    @Override
    public int findMaxDicIdByName(String dicName) {
        return baseDao.getMapper(DictionaryMapper.class).findMaxDicIdByName(dicName);
    }

    @Override
    public String findDicCodeByDicName(String dicName){
        return baseDao.getMapper(DictionaryMapper.class).findDicCodeByDicName(dicName);
    }

    @Override
    public void update(Dictionary dictionary) {
        baseDao.getMapper(DictionaryMapper.class).updateByPrimaryKeySelective(dictionary);
    }

    @Override
    public void delete(int id) {
        baseDao.getMapper(DictionaryMapper.class).deleteByPrimaryKey(id);
    }
}

