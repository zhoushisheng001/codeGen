<#include "var.ftl"/><#t/>
<#-- ================================ -->
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE mapper PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN" "http://mybatis.org/dtd/mybatis-3-mapper.dtd">
<mapper namespace="${daoClass}">
    <resultMap id="BaseResultMap" type="${voClass}">
        <id column="${pk.columnName}" jdbcType="${pk.column.jdbcType}" property="${pk.name}" /><#list nonPrimaryKeyFields as f>
        <result column="${f.column.name}" jdbcType="${f.column.jdbcType}" property="${f.name}" /></#list>
    </resultMap>
    <sql id="BaseTable">
        ${pojo.table.name}
    </sql>
</mapper>