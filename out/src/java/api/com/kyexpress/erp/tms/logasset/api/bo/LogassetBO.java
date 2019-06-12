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

package com.kyexpress.erp.tms.logasset.api.bo;

import com.kyexpress.framework.model.GenericBO;
import com.kyexpress.erp.tms.logasset.api.model.Logasset;

/**
 * <pre>
 * 客户交易数据<<logasset>>(数据来源于集中交易和融资融券)业务实体类
 * </pre>
 */
public class LogassetBO extends GenericBO<Logasset> {
    public LogassetBO() {
        setVo(new Logasset());
    }
    
    public Logasset getLogasset() {
        return (Logasset) getVo();
    }
    
    public void setLogasset(Logasset vo) {
        setVo(vo);
    }
}