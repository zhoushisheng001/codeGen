<#include "var.ftl"/><#t/>
<#assign hasTimeDateType = 'false' />
<#list allFields as f><#if !especialFields?seq_contains(f.name)><#if f.dateType == 'Timestamp'><#assign hasTimeDateType = 'true' /></#if></#if></#list>
<#-- ================================ -->
<#include "../Copyright.ftl"/>
<#include "../JavaHeader.ftl"/>

package ${pojo.packageName};

import java.io.Serializable;
<#if hasTimeDateType == 'true'>
import java.sql.Timestamp;
</#if>

import javax.validation.constraints.NotNull;

<#if hasTimeDateType == 'true'>
import com.fasterxml.jackson.annotation.JsonFormat;
</#if>
import com.kyexpress.framework.model.GenericModel;

/**
 * <pre>
 * ${pojo.table.comment}实体类
 * 数据库表名称：${pojo.table.name}
 * </pre>
 */
public class ${pojo.name} extends GenericModel<${pk.dateType}> implements Serializable {
    private static final long serialVersionUID = 1L;
	<#include "PojoFields.ftl"/>
	<#include "../PojoConstructors.ftl"/>
	<#include "../PojoPropertyAccessors.ftl"/>
	<#include "../PojoToString.ftl"/>
	<#include "../PojoEqualsHashcode.ftl"/>
}