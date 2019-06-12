<#include "var.ftl"/><#t/>
<#-- ================================ -->
[
	<#list allFields as f>
	{
    "propertyName": "${f.name}",
    "columnName": "${f.column.name}",
    "columnType": "string",
    "label": "${f.column.fullComment}",
    "lookupCode": ""
  }<#if f_has_next>,</#if>
<#---->
</#list>
]