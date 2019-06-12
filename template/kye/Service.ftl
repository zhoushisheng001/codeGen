<#include "var.ftl"/><#t/>
<#-- ================================ -->
<#include "../Copyright.ftl"/>
<#include "../JavaHeader.ftl"/>

package ${pojo.packageName};

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kyexpress.framework.service.GenericService;
import ${voClass};
import ${daoClass};

/**
 * <pre>
 * ${pojo.table.comment}业务类
 * </pre>
 */
@Service("${serviceVar}")
public class ${pojo.fileName} extends GenericService<${pojo.name}, ${pk.dateType}> {
    public ${pojo.fileName}(@Autowired ${dao} ${daoVar}) {
        super(${daoVar});
    }
    
    public ${dao} getMapper() {
        return (${dao}) super.genericMapper;
    }
}