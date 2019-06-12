<#include "var.ftl"/><#t/>
<#-- ================================ -->
<#include "../Copyright.ftl"/>
<#include "../JavaHeader.ftl"/>

package ${pojo.packageName};

import com.kyexpress.framework.mapper.GenericMapper;
import org.apache.ibatis.annotations.Mapper;
import ${voClass};

/**
 * <pre>
 * ${pojo.table.comment}数据访问接口
 * </pre>
 */
@Mapper
public interface ${pojo.fileName} extends GenericMapper<${pojo.name}, ${pk.dateType}> {
}