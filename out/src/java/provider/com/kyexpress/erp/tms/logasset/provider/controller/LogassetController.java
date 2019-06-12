/**************************************************************************/
/*          乐在分享 zhoushisheng                                        */
/*                                                                       */
/*                                                                       */

/**************************************************************************/

/**
  * <pre>
  * 作   者：zhoushisheng;
  * 创建日期：2019-6-12
  * </pre>
  */

package com.kyexpress.erp.tms.logasset.provider.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kyexpress.common.authcenter.client.annotation.Authentication;
import com.kyexpress.common.authcenter.client.constant.PrivilegeCode;
import com.kyexpress.erp.tms.logasset.api.model.Logasset;
import com.kyexpress.erp.tms.logasset.api.bo.LogassetBO;
import com.kyexpress.erp.tms.logasset.api.service.LogassetRemoteService;
import com.kyexpress.erp.tms.logasset.provider.service.LogassetService;
import com.kyexpress.framework.annotation.PropertyFiltration;
import com.kyexpress.framework.model.Pagination;
import com.kyexpress.framework.model.ResponseData;
import com.kyexpress.framework.validator.annotation.FluentValid;


/**
 * <pre>
 * 客户交易数据<<logasset>>(数据来源于集中交易和融资融券)表现层控制类
 * </pre>
 */
@RestController
@Authentication(name = "logasset", description = "客户交易数据<<logasset>>(数据来源于集中交易和融资融券)", privilege = PrivilegeCode.DEFAULT)
public class LogassetController implements LogassetRemoteService {

    private static final Logger logger = LoggerFactory.getLogger(LogassetController.class);
    
    @Autowired
    private LogassetService logassetService;

    @Override
    @Authentication(name = PrivilegeCode.DETAIL, description = PrivilegeCode.DETAIL_DESCRIPTION)
    @PropertyFiltration
    public ResponseData<Logasset> get(@RequestBody Logasset logasset) {
        logasset = logassetService.get(logasset.getId());
        ResponseData<Logasset> resp = new ResponseData<>();
        resp.setData(logasset).ok();
        return resp;
    }
    
    @Override
    @Authentication(name = PrivilegeCode.ADD, description = PrivilegeCode.ADD_DESCRIPTION)
    public ResponseData<Integer> save(@FluentValid @RequestBody Logasset logasset) {
        ResponseData<Integer> resp = new ResponseData<>();
        // TODO save ...
        // resp.setData().ok();
        return resp;
    }
    
    @Override
    @Authentication(name = PrivilegeCode.UPDATE, description = PrivilegeCode.UPDATE_DESCRIPTION)
    public ResponseData<Integer> update(@FluentValid @RequestBody Logasset logasset) {
        ResponseData<Integer> resp = new ResponseData<>();
        // TODO update ...
        //resp.setData().ok();
        return resp;
    }
    
        @Override
    @Authentication(name = PrivilegeCode.SELECT_ALL, description = PrivilegeCode.SELECT_ALL_DESCRIPTION)
    @PropertyFiltration
    public ResponseData<List<Logasset>> list(@RequestBody Logasset logasset) {
        ResponseData<List<Logasset>> resp = new ResponseData<>();
        // TODO list ...
        // resp.setData().ok();
        return resp;
    }

    @Override
    @Authentication(name = PrivilegeCode.SELECT, description = PrivilegeCode.SELECT_DESCRIPTION)
    @PropertyFiltration
    public ResponseData<Pagination<Logasset>> search(@RequestBody LogassetBO logassetBO) {
        ResponseData<Pagination<Logasset>> resp = new ResponseData<>();
        @SuppressWarnings("unchecked")
        Pagination<Logasset> pagination = Pagination.getInstance4BO(logassetBO);
        logassetService.search(pagination);
        resp.setData(pagination).ok();
        return resp;
    }
}