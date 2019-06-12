<#include "var.ftl"/><#t/>
<#-- ================================ -->
<#include "../Copyright.ftl"/>
<#include "../JavaHeader.ftl"/>

package ${pojo.packageName};

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ${voClass};
import ${boClass};
import com.kyexpress.framework.model.Pagination;
import com.kyexpress.framework.model.ResponseData;

/**
 * <pre>
 * ${pojo.table.comment}业务接口
 * </pre>
 */
public interface ${pojo.fileName} {
    
    @RequestMapping(value = "/${voVar}/get", method = RequestMethod.POST)
    ResponseData<${pojo.name}> get(@RequestBody ${vo} ${voVar});
    
    @RequestMapping(value = "/${voVar}/save", method = RequestMethod.POST)
    ResponseData<Integer> save(@RequestBody ${vo} ${voVar});
    
    @RequestMapping(value = "/${voVar}/update", method = RequestMethod.POST)
    ResponseData<Integer> update(@RequestBody ${vo} ${voVar});
    
    @RequestMapping(value = "/${voVar}/list", method = RequestMethod.POST)
    ResponseData<List<${vo}>> list(@RequestBody ${vo} ${voVar});

    @RequestMapping(value = "/${voVar}/search", method = RequestMethod.POST)
    ResponseData<Pagination<${vo}>> search(@RequestBody ${bo} ${boVar});
}