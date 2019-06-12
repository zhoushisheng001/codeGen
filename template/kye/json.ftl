<#include "var.ftl"/><#t/>
<#-- ================================ -->
{
	<#list allFields as f>"${f.name}": "0"<#if f_has_next>,</#if>
<#---->
</#list>
}