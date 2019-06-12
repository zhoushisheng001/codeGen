<#include "var.ftl"/><#t/>
<#assign basePath = custom.module + '/' + voVar>
<#-- ================================ -->
<#include "../Copyright.ftl"/>
<#include "../JavaHeader.ftl"/>

package ${pojo.packageName};

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kyexpress.common.authcenter.client.annotation.Authentication;
import com.kyexpress.common.authcenter.client.constant.PrivilegeCode;
import ${voClass};
import ${boClass};
import ${remoteServiceClass};
import ${serviceClass};
import com.kyexpress.framework.annotation.PropertyFiltration;
import com.kyexpress.framework.model.Pagination;
import com.kyexpress.framework.model.ResponseData;
import com.kyexpress.framework.validator.annotation.FluentValid;


/**
 * <pre>
 * ${pojo.table.comment}表现层控制类
 * </pre>
 */
@RestController
@Authentication(name = "${voVar}", description = "${pojo.table.comment}", privilege = PrivilegeCode.DEFAULT)
public class ${pojo.fileName} implements ${vo}RemoteService {

    private static final Logger logger = LoggerFactory.getLogger(${pojo.fileName}.class);
    
    @Autowired
    private ${service} ${serviceVar};

    @Override
    @Authentication(name = PrivilegeCode.DETAIL, description = PrivilegeCode.DETAIL_DESCRIPTION)
    @PropertyFiltration
    public ResponseData<${vo}> get(@RequestBody ${vo} ${voVar}) {
        ${voVar} = ${serviceVar}.get(${voVar}.getId());
        ResponseData<${vo}> resp = new ResponseData<>();
        resp.setData(${voVar}).ok();
        return resp;
    }
    
    @Override
    @Authentication(name = PrivilegeCode.ADD, description = PrivilegeCode.ADD_DESCRIPTION)
    public ResponseData<Integer> save(@FluentValid @RequestBody ${vo} ${voVar}) {
        ResponseData<Integer> resp = new ResponseData<>();
        // TODO save ...
        // resp.setData().ok();
        return resp;
    }
    
    @Override
    @Authentication(name = PrivilegeCode.UPDATE, description = PrivilegeCode.UPDATE_DESCRIPTION)
    public ResponseData<Integer> update(@FluentValid @RequestBody ${vo} ${voVar}) {
        ResponseData<Integer> resp = new ResponseData<>();
        // TODO update ...
        //resp.setData().ok();
        return resp;
    }
    
        @Override
    @Authentication(name = PrivilegeCode.SELECT_ALL, description = PrivilegeCode.SELECT_ALL_DESCRIPTION)
    @PropertyFiltration
    public ResponseData<List<${vo}>> list(@RequestBody ${vo} ${voVar}) {
        ResponseData<List<${vo}>> resp = new ResponseData<>();
        // TODO list ...
        // resp.setData().ok();
        return resp;
    }

    @Override
    @Authentication(name = PrivilegeCode.SELECT, description = PrivilegeCode.SELECT_DESCRIPTION)
    @PropertyFiltration
    public ResponseData<Pagination<${vo}>> search(@RequestBody ${bo} ${boVar}) {
        ResponseData<Pagination<${vo}>> resp = new ResponseData<>();
        @SuppressWarnings("unchecked")
        Pagination<${vo}> pagination = Pagination.getInstance4BO(${boVar});
        ${serviceVar}.search(pagination);
        resp.setData(pagination).ok();
        return resp;
    }
}