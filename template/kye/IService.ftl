<#include "var.ftl"/><#t/>
<#-- ================================ -->
<#include "../Copyright.ftl"/>
<#include "../JavaHeader.ftl"/>

package ${pojo.packageName};

import org.springframework.stereotype.Service;

import ${voClass};

/**
 * <pre>
 * ${pojo.table.comment}业务接口
 * </pre>
 */
@Service
public interface ${pojo.fileName} extends GenericService<${pojo.name}, Long> {
    public void search(Pagination page);
}