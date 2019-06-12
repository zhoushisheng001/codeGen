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

package com.kyexpress.erp.tms.logasset.provider.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kyexpress.framework.service.GenericService;
import com.kyexpress.erp.tms.logasset.api.model.Logasset;
import com.kyexpress.erp.tms.logasset.provider.mapper.LogassetMapper;

/**
 * <pre>
 * 客户交易数据<<logasset>>(数据来源于集中交易和融资融券)业务类
 * </pre>
 */
@Service("logassetService")
public class LogassetService extends GenericService<Logasset, Long> {
    public LogassetService(@Autowired LogassetMapper logassetMapper) {
        super(logassetMapper);
    }
    
    public LogassetMapper getMapper() {
        return (LogassetMapper) super.genericMapper;
    }
}