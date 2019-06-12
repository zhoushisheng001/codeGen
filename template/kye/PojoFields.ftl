<#-- ================================ -->
<#list allFields as f><#if !especialFields?seq_contains(f.name)><#if !f.column.pkFlag>

    <#---->/**
     * <#if f.column.fullComment != ''>字段名称：${f.column.fullComment?html}</#if>
     * 
     * 数据库字段信息:${f.column.name} ${f.column.dataTypeDesc?replace("\n", " ")}
     */<#----><#if f.dateType == 'Timestamp'>
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")</#if><#if !f.column.nullAble>
    @NotNull(message = "${f.column.name?upper_case}_NULL")</#if>
    private ${f.dateType} ${f.name};
</#if></#if>
</#list>