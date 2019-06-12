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

package com.kyexpress.erp.tms.logasset.provider.mapper;

import com.kyexpress.framework.mapper.GenericMapper;
import org.apache.ibatis.annotations.Mapper;
import com.kyexpress.erp.tms.logasset.api.model.Logasset;

/**
 * <pre>
 * 客户交易数据<<logasset>>(数据来源于集中交易和融资融券)数据访问接口
 * </pre>
 */
@Mapper
public interface LogassetMapper extends GenericMapper<Logasset, Long> {
}