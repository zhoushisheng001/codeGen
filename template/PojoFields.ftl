<#-- ================================ -->
<#list allFields as f><#if !especialFields?seq_contains(f.name)>

    <#---->/**
     * <#if f.column.fullComment != ''>字段名称：${f.column.fullComment?html}</#if>
     * 
     * 数据库字段信息:${f.column.name} ${f.column.dataTypeDesc}
     */<#---->
    private ${f.dateType} ${f.name};
</#if>
</#list>