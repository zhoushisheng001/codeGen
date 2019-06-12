<#include "var.ftl"/><#t/>
<#-- ================================ -->
[
	<#list allFields as f>
	{
    "key": "${f.name}",
    "label": "${f.column.fullComment}"
  }<#if f_has_next>,</#if>
<#---->
</#list>
]