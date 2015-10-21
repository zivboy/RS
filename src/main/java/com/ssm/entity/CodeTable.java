package com.ssm.entity;

import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

/**
 * 代码主页模型
 * Created by vincent on 2014/10/14.
 */
@Repository
public class CodeTable implements Serializable {
    private String moduleCodeUrl;//模块路径
    private String moduleCode;//模块编码
    private String lowerModuleCode;//模块编码
    private String moduleName;//模块中文名称
    private String indexPageName;//查询页面
    private String editPageName;//编辑页面
    private String parentId;//父级
    private String className;//图标
    private List<CodeColumn> columns;

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getLowerModuleCode() {
        return lowerModuleCode;
    }

    public void setLowerModuleCode(String lowerModuleCode) {
        this.lowerModuleCode = lowerModuleCode;
    }

    public List<CodeColumn> getColumns() {
        return columns;
    }

    public void setColumns(List<CodeColumn> columns) {
        this.columns = columns;
    }

    public String getModuleCodeUrl() {
        return moduleCodeUrl;
    }

    public void setModuleCodeUrl(String moduleCodeUrl) {
        this.moduleCodeUrl = moduleCodeUrl;
    }

    public String getModuleCode() {
        return moduleCode;
    }

    public void setModuleCode(String moduleCode) {
        this.moduleCode = moduleCode;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public String getIndexPageName() {
        return indexPageName;
    }

    public void setIndexPageName(String indexPageName) {
        this.indexPageName = indexPageName;
    }

    public String getEditPageName() {
        return editPageName;
    }

    public void setEditPageName(String editPageName) {
        this.editPageName = editPageName;
    }
}
