package com.ssm.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TablesCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TablesCriteria() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        public void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andTableCatalogIsNull() {
            addCriterion("TABLE_CATALOG is null");
            return (Criteria) this;
        }

        public Criteria andTableCatalogIsNotNull() {
            addCriterion("TABLE_CATALOG is not null");
            return (Criteria) this;
        }

        public Criteria andTableCatalogEqualTo(String value) {
            addCriterion("TABLE_CATALOG =", value, "tableCatalog");
            return (Criteria) this;
        }

        public Criteria andTableCatalogNotEqualTo(String value) {
            addCriterion("TABLE_CATALOG <>", value, "tableCatalog");
            return (Criteria) this;
        }

        public Criteria andTableCatalogGreaterThan(String value) {
            addCriterion("TABLE_CATALOG >", value, "tableCatalog");
            return (Criteria) this;
        }

        public Criteria andTableCatalogGreaterThanOrEqualTo(String value) {
            addCriterion("TABLE_CATALOG >=", value, "tableCatalog");
            return (Criteria) this;
        }

        public Criteria andTableCatalogLessThan(String value) {
            addCriterion("TABLE_CATALOG <", value, "tableCatalog");
            return (Criteria) this;
        }

        public Criteria andTableCatalogLessThanOrEqualTo(String value) {
            addCriterion("TABLE_CATALOG <=", value, "tableCatalog");
            return (Criteria) this;
        }

        public Criteria andTableCatalogLike(String value) {
            addCriterion("TABLE_CATALOG like", value, "tableCatalog");
            return (Criteria) this;
        }

        public Criteria andTableCatalogNotLike(String value) {
            addCriterion("TABLE_CATALOG not like", value, "tableCatalog");
            return (Criteria) this;
        }

        public Criteria andTableCatalogIn(List<String> values) {
            addCriterion("TABLE_CATALOG in", values, "tableCatalog");
            return (Criteria) this;
        }

        public Criteria andTableCatalogNotIn(List<String> values) {
            addCriterion("TABLE_CATALOG not in", values, "tableCatalog");
            return (Criteria) this;
        }

        public Criteria andTableCatalogBetween(String value1, String value2) {
            addCriterion("TABLE_CATALOG between", value1, value2, "tableCatalog");
            return (Criteria) this;
        }

        public Criteria andTableCatalogNotBetween(String value1, String value2) {
            addCriterion("TABLE_CATALOG not between", value1, value2, "tableCatalog");
            return (Criteria) this;
        }

        public Criteria andTableSchemaIsNull() {
            addCriterion("TABLE_SCHEMA is null");
            return (Criteria) this;
        }

        public Criteria andTableSchemaIsNotNull() {
            addCriterion("TABLE_SCHEMA is not null");
            return (Criteria) this;
        }

        public Criteria andTableSchemaEqualTo(String value) {
            addCriterion("TABLE_SCHEMA =", value, "tableSchema");
            return (Criteria) this;
        }

        public Criteria andTableSchemaNotEqualTo(String value) {
            addCriterion("TABLE_SCHEMA <>", value, "tableSchema");
            return (Criteria) this;
        }

        public Criteria andTableSchemaGreaterThan(String value) {
            addCriterion("TABLE_SCHEMA >", value, "tableSchema");
            return (Criteria) this;
        }

        public Criteria andTableSchemaGreaterThanOrEqualTo(String value) {
            addCriterion("TABLE_SCHEMA >=", value, "tableSchema");
            return (Criteria) this;
        }

        public Criteria andTableSchemaLessThan(String value) {
            addCriterion("TABLE_SCHEMA <", value, "tableSchema");
            return (Criteria) this;
        }

        public Criteria andTableSchemaLessThanOrEqualTo(String value) {
            addCriterion("TABLE_SCHEMA <=", value, "tableSchema");
            return (Criteria) this;
        }

        public Criteria andTableSchemaLike(String value) {
            addCriterion("TABLE_SCHEMA like", value, "tableSchema");
            return (Criteria) this;
        }

        public Criteria andTableSchemaNotLike(String value) {
            addCriterion("TABLE_SCHEMA not like", value, "tableSchema");
            return (Criteria) this;
        }

        public Criteria andTableSchemaIn(List<String> values) {
            addCriterion("TABLE_SCHEMA in", values, "tableSchema");
            return (Criteria) this;
        }

        public Criteria andTableSchemaNotIn(List<String> values) {
            addCriterion("TABLE_SCHEMA not in", values, "tableSchema");
            return (Criteria) this;
        }

        public Criteria andTableSchemaBetween(String value1, String value2) {
            addCriterion("TABLE_SCHEMA between", value1, value2, "tableSchema");
            return (Criteria) this;
        }

        public Criteria andTableSchemaNotBetween(String value1, String value2) {
            addCriterion("TABLE_SCHEMA not between", value1, value2, "tableSchema");
            return (Criteria) this;
        }

        public Criteria andTableNameIsNull() {
            addCriterion("TABLE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andTableNameIsNotNull() {
            addCriterion("TABLE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andTableNameEqualTo(String value) {
            addCriterion("TABLE_NAME =", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotEqualTo(String value) {
            addCriterion("TABLE_NAME <>", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameGreaterThan(String value) {
            addCriterion("TABLE_NAME >", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameGreaterThanOrEqualTo(String value) {
            addCriterion("TABLE_NAME >=", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameLessThan(String value) {
            addCriterion("TABLE_NAME <", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameLessThanOrEqualTo(String value) {
            addCriterion("TABLE_NAME <=", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameLike(String value) {
            addCriterion("TABLE_NAME like", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotLike(String value) {
            addCriterion("TABLE_NAME not like", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameIn(List<String> values) {
            addCriterion("TABLE_NAME in", values, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotIn(List<String> values) {
            addCriterion("TABLE_NAME not in", values, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameBetween(String value1, String value2) {
            addCriterion("TABLE_NAME between", value1, value2, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotBetween(String value1, String value2) {
            addCriterion("TABLE_NAME not between", value1, value2, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableTypeIsNull() {
            addCriterion("TABLE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTableTypeIsNotNull() {
            addCriterion("TABLE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTableTypeEqualTo(String value) {
            addCriterion("TABLE_TYPE =", value, "tableType");
            return (Criteria) this;
        }

        public Criteria andTableTypeNotEqualTo(String value) {
            addCriterion("TABLE_TYPE <>", value, "tableType");
            return (Criteria) this;
        }

        public Criteria andTableTypeGreaterThan(String value) {
            addCriterion("TABLE_TYPE >", value, "tableType");
            return (Criteria) this;
        }

        public Criteria andTableTypeGreaterThanOrEqualTo(String value) {
            addCriterion("TABLE_TYPE >=", value, "tableType");
            return (Criteria) this;
        }

        public Criteria andTableTypeLessThan(String value) {
            addCriterion("TABLE_TYPE <", value, "tableType");
            return (Criteria) this;
        }

        public Criteria andTableTypeLessThanOrEqualTo(String value) {
            addCriterion("TABLE_TYPE <=", value, "tableType");
            return (Criteria) this;
        }

        public Criteria andTableTypeLike(String value) {
            addCriterion("TABLE_TYPE like", value, "tableType");
            return (Criteria) this;
        }

        public Criteria andTableTypeNotLike(String value) {
            addCriterion("TABLE_TYPE not like", value, "tableType");
            return (Criteria) this;
        }

        public Criteria andTableTypeIn(List<String> values) {
            addCriterion("TABLE_TYPE in", values, "tableType");
            return (Criteria) this;
        }

        public Criteria andTableTypeNotIn(List<String> values) {
            addCriterion("TABLE_TYPE not in", values, "tableType");
            return (Criteria) this;
        }

        public Criteria andTableTypeBetween(String value1, String value2) {
            addCriterion("TABLE_TYPE between", value1, value2, "tableType");
            return (Criteria) this;
        }

        public Criteria andTableTypeNotBetween(String value1, String value2) {
            addCriterion("TABLE_TYPE not between", value1, value2, "tableType");
            return (Criteria) this;
        }

        public Criteria andEngineIsNull() {
            addCriterion("ENGINE is null");
            return (Criteria) this;
        }

        public Criteria andEngineIsNotNull() {
            addCriterion("ENGINE is not null");
            return (Criteria) this;
        }

        public Criteria andEngineEqualTo(String value) {
            addCriterion("ENGINE =", value, "engine");
            return (Criteria) this;
        }

        public Criteria andEngineNotEqualTo(String value) {
            addCriterion("ENGINE <>", value, "engine");
            return (Criteria) this;
        }

        public Criteria andEngineGreaterThan(String value) {
            addCriterion("ENGINE >", value, "engine");
            return (Criteria) this;
        }

        public Criteria andEngineGreaterThanOrEqualTo(String value) {
            addCriterion("ENGINE >=", value, "engine");
            return (Criteria) this;
        }

        public Criteria andEngineLessThan(String value) {
            addCriterion("ENGINE <", value, "engine");
            return (Criteria) this;
        }

        public Criteria andEngineLessThanOrEqualTo(String value) {
            addCriterion("ENGINE <=", value, "engine");
            return (Criteria) this;
        }

        public Criteria andEngineLike(String value) {
            addCriterion("ENGINE like", value, "engine");
            return (Criteria) this;
        }

        public Criteria andEngineNotLike(String value) {
            addCriterion("ENGINE not like", value, "engine");
            return (Criteria) this;
        }

        public Criteria andEngineIn(List<String> values) {
            addCriterion("ENGINE in", values, "engine");
            return (Criteria) this;
        }

        public Criteria andEngineNotIn(List<String> values) {
            addCriterion("ENGINE not in", values, "engine");
            return (Criteria) this;
        }

        public Criteria andEngineBetween(String value1, String value2) {
            addCriterion("ENGINE between", value1, value2, "engine");
            return (Criteria) this;
        }

        public Criteria andEngineNotBetween(String value1, String value2) {
            addCriterion("ENGINE not between", value1, value2, "engine");
            return (Criteria) this;
        }

        public Criteria andVersionIsNull() {
            addCriterion("VERSION is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("VERSION is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(Long value) {
            addCriterion("VERSION =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(Long value) {
            addCriterion("VERSION <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(Long value) {
            addCriterion("VERSION >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(Long value) {
            addCriterion("VERSION >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(Long value) {
            addCriterion("VERSION <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(Long value) {
            addCriterion("VERSION <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<Long> values) {
            addCriterion("VERSION in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<Long> values) {
            addCriterion("VERSION not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(Long value1, Long value2) {
            addCriterion("VERSION between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(Long value1, Long value2) {
            addCriterion("VERSION not between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andRowFormatIsNull() {
            addCriterion("ROW_FORMAT is null");
            return (Criteria) this;
        }

        public Criteria andRowFormatIsNotNull() {
            addCriterion("ROW_FORMAT is not null");
            return (Criteria) this;
        }

        public Criteria andRowFormatEqualTo(String value) {
            addCriterion("ROW_FORMAT =", value, "rowFormat");
            return (Criteria) this;
        }

        public Criteria andRowFormatNotEqualTo(String value) {
            addCriterion("ROW_FORMAT <>", value, "rowFormat");
            return (Criteria) this;
        }

        public Criteria andRowFormatGreaterThan(String value) {
            addCriterion("ROW_FORMAT >", value, "rowFormat");
            return (Criteria) this;
        }

        public Criteria andRowFormatGreaterThanOrEqualTo(String value) {
            addCriterion("ROW_FORMAT >=", value, "rowFormat");
            return (Criteria) this;
        }

        public Criteria andRowFormatLessThan(String value) {
            addCriterion("ROW_FORMAT <", value, "rowFormat");
            return (Criteria) this;
        }

        public Criteria andRowFormatLessThanOrEqualTo(String value) {
            addCriterion("ROW_FORMAT <=", value, "rowFormat");
            return (Criteria) this;
        }

        public Criteria andRowFormatLike(String value) {
            addCriterion("ROW_FORMAT like", value, "rowFormat");
            return (Criteria) this;
        }

        public Criteria andRowFormatNotLike(String value) {
            addCriterion("ROW_FORMAT not like", value, "rowFormat");
            return (Criteria) this;
        }

        public Criteria andRowFormatIn(List<String> values) {
            addCriterion("ROW_FORMAT in", values, "rowFormat");
            return (Criteria) this;
        }

        public Criteria andRowFormatNotIn(List<String> values) {
            addCriterion("ROW_FORMAT not in", values, "rowFormat");
            return (Criteria) this;
        }

        public Criteria andRowFormatBetween(String value1, String value2) {
            addCriterion("ROW_FORMAT between", value1, value2, "rowFormat");
            return (Criteria) this;
        }

        public Criteria andRowFormatNotBetween(String value1, String value2) {
            addCriterion("ROW_FORMAT not between", value1, value2, "rowFormat");
            return (Criteria) this;
        }

        public Criteria andTableRowsIsNull() {
            addCriterion("TABLE_ROWS is null");
            return (Criteria) this;
        }

        public Criteria andTableRowsIsNotNull() {
            addCriterion("TABLE_ROWS is not null");
            return (Criteria) this;
        }

        public Criteria andTableRowsEqualTo(Long value) {
            addCriterion("TABLE_ROWS =", value, "tableRows");
            return (Criteria) this;
        }

        public Criteria andTableRowsNotEqualTo(Long value) {
            addCriterion("TABLE_ROWS <>", value, "tableRows");
            return (Criteria) this;
        }

        public Criteria andTableRowsGreaterThan(Long value) {
            addCriterion("TABLE_ROWS >", value, "tableRows");
            return (Criteria) this;
        }

        public Criteria andTableRowsGreaterThanOrEqualTo(Long value) {
            addCriterion("TABLE_ROWS >=", value, "tableRows");
            return (Criteria) this;
        }

        public Criteria andTableRowsLessThan(Long value) {
            addCriterion("TABLE_ROWS <", value, "tableRows");
            return (Criteria) this;
        }

        public Criteria andTableRowsLessThanOrEqualTo(Long value) {
            addCriterion("TABLE_ROWS <=", value, "tableRows");
            return (Criteria) this;
        }

        public Criteria andTableRowsIn(List<Long> values) {
            addCriterion("TABLE_ROWS in", values, "tableRows");
            return (Criteria) this;
        }

        public Criteria andTableRowsNotIn(List<Long> values) {
            addCriterion("TABLE_ROWS not in", values, "tableRows");
            return (Criteria) this;
        }

        public Criteria andTableRowsBetween(Long value1, Long value2) {
            addCriterion("TABLE_ROWS between", value1, value2, "tableRows");
            return (Criteria) this;
        }

        public Criteria andTableRowsNotBetween(Long value1, Long value2) {
            addCriterion("TABLE_ROWS not between", value1, value2, "tableRows");
            return (Criteria) this;
        }

        public Criteria andAvgRowLengthIsNull() {
            addCriterion("AVG_ROW_LENGTH is null");
            return (Criteria) this;
        }

        public Criteria andAvgRowLengthIsNotNull() {
            addCriterion("AVG_ROW_LENGTH is not null");
            return (Criteria) this;
        }

        public Criteria andAvgRowLengthEqualTo(Long value) {
            addCriterion("AVG_ROW_LENGTH =", value, "avgRowLength");
            return (Criteria) this;
        }

        public Criteria andAvgRowLengthNotEqualTo(Long value) {
            addCriterion("AVG_ROW_LENGTH <>", value, "avgRowLength");
            return (Criteria) this;
        }

        public Criteria andAvgRowLengthGreaterThan(Long value) {
            addCriterion("AVG_ROW_LENGTH >", value, "avgRowLength");
            return (Criteria) this;
        }

        public Criteria andAvgRowLengthGreaterThanOrEqualTo(Long value) {
            addCriterion("AVG_ROW_LENGTH >=", value, "avgRowLength");
            return (Criteria) this;
        }

        public Criteria andAvgRowLengthLessThan(Long value) {
            addCriterion("AVG_ROW_LENGTH <", value, "avgRowLength");
            return (Criteria) this;
        }

        public Criteria andAvgRowLengthLessThanOrEqualTo(Long value) {
            addCriterion("AVG_ROW_LENGTH <=", value, "avgRowLength");
            return (Criteria) this;
        }

        public Criteria andAvgRowLengthIn(List<Long> values) {
            addCriterion("AVG_ROW_LENGTH in", values, "avgRowLength");
            return (Criteria) this;
        }

        public Criteria andAvgRowLengthNotIn(List<Long> values) {
            addCriterion("AVG_ROW_LENGTH not in", values, "avgRowLength");
            return (Criteria) this;
        }

        public Criteria andAvgRowLengthBetween(Long value1, Long value2) {
            addCriterion("AVG_ROW_LENGTH between", value1, value2, "avgRowLength");
            return (Criteria) this;
        }

        public Criteria andAvgRowLengthNotBetween(Long value1, Long value2) {
            addCriterion("AVG_ROW_LENGTH not between", value1, value2, "avgRowLength");
            return (Criteria) this;
        }

        public Criteria andDataLengthIsNull() {
            addCriterion("DATA_LENGTH is null");
            return (Criteria) this;
        }

        public Criteria andDataLengthIsNotNull() {
            addCriterion("DATA_LENGTH is not null");
            return (Criteria) this;
        }

        public Criteria andDataLengthEqualTo(Long value) {
            addCriterion("DATA_LENGTH =", value, "dataLength");
            return (Criteria) this;
        }

        public Criteria andDataLengthNotEqualTo(Long value) {
            addCriterion("DATA_LENGTH <>", value, "dataLength");
            return (Criteria) this;
        }

        public Criteria andDataLengthGreaterThan(Long value) {
            addCriterion("DATA_LENGTH >", value, "dataLength");
            return (Criteria) this;
        }

        public Criteria andDataLengthGreaterThanOrEqualTo(Long value) {
            addCriterion("DATA_LENGTH >=", value, "dataLength");
            return (Criteria) this;
        }

        public Criteria andDataLengthLessThan(Long value) {
            addCriterion("DATA_LENGTH <", value, "dataLength");
            return (Criteria) this;
        }

        public Criteria andDataLengthLessThanOrEqualTo(Long value) {
            addCriterion("DATA_LENGTH <=", value, "dataLength");
            return (Criteria) this;
        }

        public Criteria andDataLengthIn(List<Long> values) {
            addCriterion("DATA_LENGTH in", values, "dataLength");
            return (Criteria) this;
        }

        public Criteria andDataLengthNotIn(List<Long> values) {
            addCriterion("DATA_LENGTH not in", values, "dataLength");
            return (Criteria) this;
        }

        public Criteria andDataLengthBetween(Long value1, Long value2) {
            addCriterion("DATA_LENGTH between", value1, value2, "dataLength");
            return (Criteria) this;
        }

        public Criteria andDataLengthNotBetween(Long value1, Long value2) {
            addCriterion("DATA_LENGTH not between", value1, value2, "dataLength");
            return (Criteria) this;
        }

        public Criteria andMaxDataLengthIsNull() {
            addCriterion("MAX_DATA_LENGTH is null");
            return (Criteria) this;
        }

        public Criteria andMaxDataLengthIsNotNull() {
            addCriterion("MAX_DATA_LENGTH is not null");
            return (Criteria) this;
        }

        public Criteria andMaxDataLengthEqualTo(Long value) {
            addCriterion("MAX_DATA_LENGTH =", value, "maxDataLength");
            return (Criteria) this;
        }

        public Criteria andMaxDataLengthNotEqualTo(Long value) {
            addCriterion("MAX_DATA_LENGTH <>", value, "maxDataLength");
            return (Criteria) this;
        }

        public Criteria andMaxDataLengthGreaterThan(Long value) {
            addCriterion("MAX_DATA_LENGTH >", value, "maxDataLength");
            return (Criteria) this;
        }

        public Criteria andMaxDataLengthGreaterThanOrEqualTo(Long value) {
            addCriterion("MAX_DATA_LENGTH >=", value, "maxDataLength");
            return (Criteria) this;
        }

        public Criteria andMaxDataLengthLessThan(Long value) {
            addCriterion("MAX_DATA_LENGTH <", value, "maxDataLength");
            return (Criteria) this;
        }

        public Criteria andMaxDataLengthLessThanOrEqualTo(Long value) {
            addCriterion("MAX_DATA_LENGTH <=", value, "maxDataLength");
            return (Criteria) this;
        }

        public Criteria andMaxDataLengthIn(List<Long> values) {
            addCriterion("MAX_DATA_LENGTH in", values, "maxDataLength");
            return (Criteria) this;
        }

        public Criteria andMaxDataLengthNotIn(List<Long> values) {
            addCriterion("MAX_DATA_LENGTH not in", values, "maxDataLength");
            return (Criteria) this;
        }

        public Criteria andMaxDataLengthBetween(Long value1, Long value2) {
            addCriterion("MAX_DATA_LENGTH between", value1, value2, "maxDataLength");
            return (Criteria) this;
        }

        public Criteria andMaxDataLengthNotBetween(Long value1, Long value2) {
            addCriterion("MAX_DATA_LENGTH not between", value1, value2, "maxDataLength");
            return (Criteria) this;
        }

        public Criteria andIndexLengthIsNull() {
            addCriterion("INDEX_LENGTH is null");
            return (Criteria) this;
        }

        public Criteria andIndexLengthIsNotNull() {
            addCriterion("INDEX_LENGTH is not null");
            return (Criteria) this;
        }

        public Criteria andIndexLengthEqualTo(Long value) {
            addCriterion("INDEX_LENGTH =", value, "indexLength");
            return (Criteria) this;
        }

        public Criteria andIndexLengthNotEqualTo(Long value) {
            addCriterion("INDEX_LENGTH <>", value, "indexLength");
            return (Criteria) this;
        }

        public Criteria andIndexLengthGreaterThan(Long value) {
            addCriterion("INDEX_LENGTH >", value, "indexLength");
            return (Criteria) this;
        }

        public Criteria andIndexLengthGreaterThanOrEqualTo(Long value) {
            addCriterion("INDEX_LENGTH >=", value, "indexLength");
            return (Criteria) this;
        }

        public Criteria andIndexLengthLessThan(Long value) {
            addCriterion("INDEX_LENGTH <", value, "indexLength");
            return (Criteria) this;
        }

        public Criteria andIndexLengthLessThanOrEqualTo(Long value) {
            addCriterion("INDEX_LENGTH <=", value, "indexLength");
            return (Criteria) this;
        }

        public Criteria andIndexLengthIn(List<Long> values) {
            addCriterion("INDEX_LENGTH in", values, "indexLength");
            return (Criteria) this;
        }

        public Criteria andIndexLengthNotIn(List<Long> values) {
            addCriterion("INDEX_LENGTH not in", values, "indexLength");
            return (Criteria) this;
        }

        public Criteria andIndexLengthBetween(Long value1, Long value2) {
            addCriterion("INDEX_LENGTH between", value1, value2, "indexLength");
            return (Criteria) this;
        }

        public Criteria andIndexLengthNotBetween(Long value1, Long value2) {
            addCriterion("INDEX_LENGTH not between", value1, value2, "indexLength");
            return (Criteria) this;
        }

        public Criteria andDataFreeIsNull() {
            addCriterion("DATA_FREE is null");
            return (Criteria) this;
        }

        public Criteria andDataFreeIsNotNull() {
            addCriterion("DATA_FREE is not null");
            return (Criteria) this;
        }

        public Criteria andDataFreeEqualTo(Long value) {
            addCriterion("DATA_FREE =", value, "dataFree");
            return (Criteria) this;
        }

        public Criteria andDataFreeNotEqualTo(Long value) {
            addCriterion("DATA_FREE <>", value, "dataFree");
            return (Criteria) this;
        }

        public Criteria andDataFreeGreaterThan(Long value) {
            addCriterion("DATA_FREE >", value, "dataFree");
            return (Criteria) this;
        }

        public Criteria andDataFreeGreaterThanOrEqualTo(Long value) {
            addCriterion("DATA_FREE >=", value, "dataFree");
            return (Criteria) this;
        }

        public Criteria andDataFreeLessThan(Long value) {
            addCriterion("DATA_FREE <", value, "dataFree");
            return (Criteria) this;
        }

        public Criteria andDataFreeLessThanOrEqualTo(Long value) {
            addCriterion("DATA_FREE <=", value, "dataFree");
            return (Criteria) this;
        }

        public Criteria andDataFreeIn(List<Long> values) {
            addCriterion("DATA_FREE in", values, "dataFree");
            return (Criteria) this;
        }

        public Criteria andDataFreeNotIn(List<Long> values) {
            addCriterion("DATA_FREE not in", values, "dataFree");
            return (Criteria) this;
        }

        public Criteria andDataFreeBetween(Long value1, Long value2) {
            addCriterion("DATA_FREE between", value1, value2, "dataFree");
            return (Criteria) this;
        }

        public Criteria andDataFreeNotBetween(Long value1, Long value2) {
            addCriterion("DATA_FREE not between", value1, value2, "dataFree");
            return (Criteria) this;
        }

        public Criteria andAutoIncrementIsNull() {
            addCriterion("AUTO_INCREMENT is null");
            return (Criteria) this;
        }

        public Criteria andAutoIncrementIsNotNull() {
            addCriterion("AUTO_INCREMENT is not null");
            return (Criteria) this;
        }

        public Criteria andAutoIncrementEqualTo(Long value) {
            addCriterion("AUTO_INCREMENT =", value, "autoIncrement");
            return (Criteria) this;
        }

        public Criteria andAutoIncrementNotEqualTo(Long value) {
            addCriterion("AUTO_INCREMENT <>", value, "autoIncrement");
            return (Criteria) this;
        }

        public Criteria andAutoIncrementGreaterThan(Long value) {
            addCriterion("AUTO_INCREMENT >", value, "autoIncrement");
            return (Criteria) this;
        }

        public Criteria andAutoIncrementGreaterThanOrEqualTo(Long value) {
            addCriterion("AUTO_INCREMENT >=", value, "autoIncrement");
            return (Criteria) this;
        }

        public Criteria andAutoIncrementLessThan(Long value) {
            addCriterion("AUTO_INCREMENT <", value, "autoIncrement");
            return (Criteria) this;
        }

        public Criteria andAutoIncrementLessThanOrEqualTo(Long value) {
            addCriterion("AUTO_INCREMENT <=", value, "autoIncrement");
            return (Criteria) this;
        }

        public Criteria andAutoIncrementIn(List<Long> values) {
            addCriterion("AUTO_INCREMENT in", values, "autoIncrement");
            return (Criteria) this;
        }

        public Criteria andAutoIncrementNotIn(List<Long> values) {
            addCriterion("AUTO_INCREMENT not in", values, "autoIncrement");
            return (Criteria) this;
        }

        public Criteria andAutoIncrementBetween(Long value1, Long value2) {
            addCriterion("AUTO_INCREMENT between", value1, value2, "autoIncrement");
            return (Criteria) this;
        }

        public Criteria andAutoIncrementNotBetween(Long value1, Long value2) {
            addCriterion("AUTO_INCREMENT not between", value1, value2, "autoIncrement");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("UPDATE_TIME =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("UPDATE_TIME <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("UPDATE_TIME >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("UPDATE_TIME <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("UPDATE_TIME in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("UPDATE_TIME not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeIsNull() {
            addCriterion("CHECK_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCheckTimeIsNotNull() {
            addCriterion("CHECK_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCheckTimeEqualTo(Date value) {
            addCriterion("CHECK_TIME =", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeNotEqualTo(Date value) {
            addCriterion("CHECK_TIME <>", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeGreaterThan(Date value) {
            addCriterion("CHECK_TIME >", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CHECK_TIME >=", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeLessThan(Date value) {
            addCriterion("CHECK_TIME <", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeLessThanOrEqualTo(Date value) {
            addCriterion("CHECK_TIME <=", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeIn(List<Date> values) {
            addCriterion("CHECK_TIME in", values, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeNotIn(List<Date> values) {
            addCriterion("CHECK_TIME not in", values, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeBetween(Date value1, Date value2) {
            addCriterion("CHECK_TIME between", value1, value2, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeNotBetween(Date value1, Date value2) {
            addCriterion("CHECK_TIME not between", value1, value2, "checkTime");
            return (Criteria) this;
        }

        public Criteria andTableCollationIsNull() {
            addCriterion("TABLE_COLLATION is null");
            return (Criteria) this;
        }

        public Criteria andTableCollationIsNotNull() {
            addCriterion("TABLE_COLLATION is not null");
            return (Criteria) this;
        }

        public Criteria andTableCollationEqualTo(String value) {
            addCriterion("TABLE_COLLATION =", value, "tableCollation");
            return (Criteria) this;
        }

        public Criteria andTableCollationNotEqualTo(String value) {
            addCriterion("TABLE_COLLATION <>", value, "tableCollation");
            return (Criteria) this;
        }

        public Criteria andTableCollationGreaterThan(String value) {
            addCriterion("TABLE_COLLATION >", value, "tableCollation");
            return (Criteria) this;
        }

        public Criteria andTableCollationGreaterThanOrEqualTo(String value) {
            addCriterion("TABLE_COLLATION >=", value, "tableCollation");
            return (Criteria) this;
        }

        public Criteria andTableCollationLessThan(String value) {
            addCriterion("TABLE_COLLATION <", value, "tableCollation");
            return (Criteria) this;
        }

        public Criteria andTableCollationLessThanOrEqualTo(String value) {
            addCriterion("TABLE_COLLATION <=", value, "tableCollation");
            return (Criteria) this;
        }

        public Criteria andTableCollationLike(String value) {
            addCriterion("TABLE_COLLATION like", value, "tableCollation");
            return (Criteria) this;
        }

        public Criteria andTableCollationNotLike(String value) {
            addCriterion("TABLE_COLLATION not like", value, "tableCollation");
            return (Criteria) this;
        }

        public Criteria andTableCollationIn(List<String> values) {
            addCriterion("TABLE_COLLATION in", values, "tableCollation");
            return (Criteria) this;
        }

        public Criteria andTableCollationNotIn(List<String> values) {
            addCriterion("TABLE_COLLATION not in", values, "tableCollation");
            return (Criteria) this;
        }

        public Criteria andTableCollationBetween(String value1, String value2) {
            addCriterion("TABLE_COLLATION between", value1, value2, "tableCollation");
            return (Criteria) this;
        }

        public Criteria andTableCollationNotBetween(String value1, String value2) {
            addCriterion("TABLE_COLLATION not between", value1, value2, "tableCollation");
            return (Criteria) this;
        }

        public Criteria andChecksumIsNull() {
            addCriterion("CHECKSUM is null");
            return (Criteria) this;
        }

        public Criteria andChecksumIsNotNull() {
            addCriterion("CHECKSUM is not null");
            return (Criteria) this;
        }

        public Criteria andChecksumEqualTo(Long value) {
            addCriterion("CHECKSUM =", value, "checksum");
            return (Criteria) this;
        }

        public Criteria andChecksumNotEqualTo(Long value) {
            addCriterion("CHECKSUM <>", value, "checksum");
            return (Criteria) this;
        }

        public Criteria andChecksumGreaterThan(Long value) {
            addCriterion("CHECKSUM >", value, "checksum");
            return (Criteria) this;
        }

        public Criteria andChecksumGreaterThanOrEqualTo(Long value) {
            addCriterion("CHECKSUM >=", value, "checksum");
            return (Criteria) this;
        }

        public Criteria andChecksumLessThan(Long value) {
            addCriterion("CHECKSUM <", value, "checksum");
            return (Criteria) this;
        }

        public Criteria andChecksumLessThanOrEqualTo(Long value) {
            addCriterion("CHECKSUM <=", value, "checksum");
            return (Criteria) this;
        }

        public Criteria andChecksumIn(List<Long> values) {
            addCriterion("CHECKSUM in", values, "checksum");
            return (Criteria) this;
        }

        public Criteria andChecksumNotIn(List<Long> values) {
            addCriterion("CHECKSUM not in", values, "checksum");
            return (Criteria) this;
        }

        public Criteria andChecksumBetween(Long value1, Long value2) {
            addCriterion("CHECKSUM between", value1, value2, "checksum");
            return (Criteria) this;
        }

        public Criteria andChecksumNotBetween(Long value1, Long value2) {
            addCriterion("CHECKSUM not between", value1, value2, "checksum");
            return (Criteria) this;
        }

        public Criteria andCreateOptionsIsNull() {
            addCriterion("CREATE_OPTIONS is null");
            return (Criteria) this;
        }

        public Criteria andCreateOptionsIsNotNull() {
            addCriterion("CREATE_OPTIONS is not null");
            return (Criteria) this;
        }

        public Criteria andCreateOptionsEqualTo(String value) {
            addCriterion("CREATE_OPTIONS =", value, "createOptions");
            return (Criteria) this;
        }

        public Criteria andCreateOptionsNotEqualTo(String value) {
            addCriterion("CREATE_OPTIONS <>", value, "createOptions");
            return (Criteria) this;
        }

        public Criteria andCreateOptionsGreaterThan(String value) {
            addCriterion("CREATE_OPTIONS >", value, "createOptions");
            return (Criteria) this;
        }

        public Criteria andCreateOptionsGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_OPTIONS >=", value, "createOptions");
            return (Criteria) this;
        }

        public Criteria andCreateOptionsLessThan(String value) {
            addCriterion("CREATE_OPTIONS <", value, "createOptions");
            return (Criteria) this;
        }

        public Criteria andCreateOptionsLessThanOrEqualTo(String value) {
            addCriterion("CREATE_OPTIONS <=", value, "createOptions");
            return (Criteria) this;
        }

        public Criteria andCreateOptionsLike(String value) {
            addCriterion("CREATE_OPTIONS like", value, "createOptions");
            return (Criteria) this;
        }

        public Criteria andCreateOptionsNotLike(String value) {
            addCriterion("CREATE_OPTIONS not like", value, "createOptions");
            return (Criteria) this;
        }

        public Criteria andCreateOptionsIn(List<String> values) {
            addCriterion("CREATE_OPTIONS in", values, "createOptions");
            return (Criteria) this;
        }

        public Criteria andCreateOptionsNotIn(List<String> values) {
            addCriterion("CREATE_OPTIONS not in", values, "createOptions");
            return (Criteria) this;
        }

        public Criteria andCreateOptionsBetween(String value1, String value2) {
            addCriterion("CREATE_OPTIONS between", value1, value2, "createOptions");
            return (Criteria) this;
        }

        public Criteria andCreateOptionsNotBetween(String value1, String value2) {
            addCriterion("CREATE_OPTIONS not between", value1, value2, "createOptions");
            return (Criteria) this;
        }

        public Criteria andTableCommentIsNull() {
            addCriterion("TABLE_COMMENT is null");
            return (Criteria) this;
        }

        public Criteria andTableCommentIsNotNull() {
            addCriterion("TABLE_COMMENT is not null");
            return (Criteria) this;
        }

        public Criteria andTableCommentEqualTo(String value) {
            addCriterion("TABLE_COMMENT =", value, "tableComment");
            return (Criteria) this;
        }

        public Criteria andTableCommentNotEqualTo(String value) {
            addCriterion("TABLE_COMMENT <>", value, "tableComment");
            return (Criteria) this;
        }

        public Criteria andTableCommentGreaterThan(String value) {
            addCriterion("TABLE_COMMENT >", value, "tableComment");
            return (Criteria) this;
        }

        public Criteria andTableCommentGreaterThanOrEqualTo(String value) {
            addCriterion("TABLE_COMMENT >=", value, "tableComment");
            return (Criteria) this;
        }

        public Criteria andTableCommentLessThan(String value) {
            addCriterion("TABLE_COMMENT <", value, "tableComment");
            return (Criteria) this;
        }

        public Criteria andTableCommentLessThanOrEqualTo(String value) {
            addCriterion("TABLE_COMMENT <=", value, "tableComment");
            return (Criteria) this;
        }

        public Criteria andTableCommentLike(String value) {
            addCriterion("TABLE_COMMENT like", value, "tableComment");
            return (Criteria) this;
        }

        public Criteria andTableCommentNotLike(String value) {
            addCriterion("TABLE_COMMENT not like", value, "tableComment");
            return (Criteria) this;
        }

        public Criteria andTableCommentIn(List<String> values) {
            addCriterion("TABLE_COMMENT in", values, "tableComment");
            return (Criteria) this;
        }

        public Criteria andTableCommentNotIn(List<String> values) {
            addCriterion("TABLE_COMMENT not in", values, "tableComment");
            return (Criteria) this;
        }

        public Criteria andTableCommentBetween(String value1, String value2) {
            addCriterion("TABLE_COMMENT between", value1, value2, "tableComment");
            return (Criteria) this;
        }

        public Criteria andTableCommentNotBetween(String value1, String value2) {
            addCriterion("TABLE_COMMENT not between", value1, value2, "tableComment");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}