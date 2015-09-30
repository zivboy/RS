package com.ssm.common.util;

import com.ssm.common.mybatis.Page;

import java.util.List;

/**
 * Created by  moxz
 * User: 224911261@qq.com
 * 2015/9/22-22:02
 * RecruitSystem.com.ssm.common.util
 */
public class ListOperator {
    /**
     * 根据list和page返回结果，不做二次查询，提供给前台统一翻页使用
     *
     * @param list
     * @param page
     * @return
     */
    public static List<?> limitList(List<?> list, Page page) {
        for (int i = page.getOffset() - 1; i > -1 ; i--) {
            list.remove(i);
        }
        for (int i = list.size() - 1; i > page.getLimit() - 1; i--) {
            list.remove(i);
        }
        return list;
    }
}
