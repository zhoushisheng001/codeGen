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

package com.kyexpress.erp.tms.logasset.client.client.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;

import com.kyexpress.erp.tms.logasset.api.service.LogassetRemoteService;

/**
 * <pre>
 * 客户交易数据<<logasset>>(数据来源于集中交易和融资融券)业务接口
 * </pre>
 */
@FeignClient(name = Interface.SERVICE_NAME, fallback = LogassetService.HystrixClientFallback.class)
public interface LogassetService extends LogassetRemoteService {

    @Component
    public static class HystrixClientFallback implements LogassetService {
    	// to complete
    }
}