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

package com.kyexpress.erp.tms.logasset.api.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kyexpress.erp.tms.logasset.api.model.Logasset;
import com.kyexpress.erp.tms.logasset.api.bo.LogassetBO;
import com.kyexpress.framework.model.Pagination;
import com.kyexpress.framework.model.ResponseData;

/**
 * <pre>
 * 客户交易数据<<logasset>>(数据来源于集中交易和融资融券)业务接口
 * </pre>
 */
public interface LogassetRemoteService {
    
    @RequestMapping(value = "/logasset/get", method = RequestMethod.POST)
    ResponseData<Logasset> get(@RequestBody Logasset logasset);
    
    @RequestMapping(value = "/logasset/save", method = RequestMethod.POST)
    ResponseData<Integer> save(@RequestBody Logasset logasset);
    
    @RequestMapping(value = "/logasset/update", method = RequestMethod.POST)
    ResponseData<Integer> update(@RequestBody Logasset logasset);
    
    @RequestMapping(value = "/logasset/list", method = RequestMethod.POST)
    ResponseData<List<Logasset>> list(@RequestBody Logasset logasset);

    @RequestMapping(value = "/logasset/search", method = RequestMethod.POST)
    ResponseData<Pagination<Logasset>> search(@RequestBody LogassetBO logassetBO);
}