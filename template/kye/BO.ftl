<#include "var.ftl"/><#t/>
<#-- ================================ -->
<#include "../Copyright.ftl"/>
<#include "../JavaHeader.ftl"/>

package ${pojo.packageName};

import com.kyexpress.framework.model.GenericBO;
import ${voClass};

/**
 * <pre>
 * ${pojo.table.comment}业务实体类
 * </pre>
 */
public class ${bo} extends GenericBO<${pojo.name}> {
    public ${bo}() {
        setVo(new ${pojo.name}());
    }
    
    public ${pojo.name} get${pojo.name}() {
        return (${pojo.name}) getVo();
    }
    
    public void set${pojo.name}(${pojo.name} vo) {
        setVo(vo);
    }
}