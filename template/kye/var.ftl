<#-- ==============class name================== -->
<#assign vo = pojo.name>
<#assign voClass = custom.voPackage + '.' + pojo.name>
<#assign voVar = pojo.name?uncap_first>

<#assign bo = pojo.name + 'BO'>
<#assign boClass = custom.boPackage + '.' + pojo.name + 'BO'>
<#assign boVar = bo?uncap_first>

<#assign remoteServiceClass = custom.remoteServicePackage + '.' + pojo.name + 'RemoteService'>

<#assign dao = pojo.name + 'Mapper'>
<#assign daoClass = custom.daoPackage + '.' + dao>
<#assign daoImplClass = daoClass + '.xml'>
<#assign daoVar = dao?uncap_first>


<#assign service = pojo.name + 'Service'>
<#assign serviceClass = custom.servicePackage + '.' + service>
<#assign serviceImplClass = custom.servicePackage + '.' + service + 'Impl'>
<#assign serviceVar = service?uncap_first>

<#-- ==============data================== -->
<#assign allFields = pojo.fields>
<#assign allFieldNames = pojo.fieldNames>
<#assign allColumnNames = pojo.table.columnNames>
<#assign primaryKeyFields = pojo.primaryKeyFields>
<#assign foreignKeyFields = pojo.foreignKeyFields>
<#assign nonPrimaryKeyFields = pojo.nonPrimaryKeyFields>
<#assign nonKeyFields = pojo.nonKeyFields>
<#assign includeClasses = pojo.pojoImpClasses>
<#assign pk = primaryKeyFields[0]>

<#assign especialFields = ["id", "createdBy", "creationDate", "updatedBy", "updationDate", "enabledFlag", "traceId"]>
<#nt/>