<#include "var.ftl"/><#t/>
<#-- ================================ -->
<#list allFields as f><#if !especialFields?seq_contains(f.name)><#if !f.column.pkFlag>
   <#---->
${f.name} ${f.column.fullComment?html}
   <#---->
</#if></#if>
</#list>