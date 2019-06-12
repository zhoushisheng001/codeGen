<#include "var.ftl"/><#t/>
<#-- ================================ -->
<#list allFields as f><#if !especialFields?seq_contains(f.name)><#if !f.column.pkFlag>
   <#---->
${f.name} <#if f.column.nullAble>N</#if><#if !f.column.nullAble>Y</#if> ${f.column.fullComment?html}
   <#---->
</#if></#if>
</#list>