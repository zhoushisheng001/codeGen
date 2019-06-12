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

package com.kyexpress.erp.tms.logasset.api.model;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import com.kyexpress.framework.model.GenericModel;

/**
 * <pre>
 * 客户交易数据<<logasset>>(数据来源于集中交易和融资融券)实体类
 * 数据库表名称：logasset
 * </pre>
 */
public class Logasset extends GenericModel<Long> implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 字段名称：机器编码
     * 
     * 数据库字段信息:serverid INT(10)
     */
    private Long serverid;

    /**
     * 字段名称：操作日期, 物理日期 (委托日期)
     * 
     * 数据库字段信息:operdate INT(10)
     */
    private Long operdate;

    /**
     * 字段名称：清算日期, (成交日期)
     * 
     * 数据库字段信息:cleardate INT(10)
     */
    private Long cleardate;

    /**
     * 字段名称：交收日期, 表明该笔业务所属日期
     * 
     * 数据库字段信息:bizdate INT(10)
     */
    private Long bizdate;

    /**
     * 字段名称：客户代码
     * 
     * 数据库字段信息:custid BIGINT(19)
     */
    private Long custid;

    /**
     * 字段名称：客户姓名
     * 
     * 数据库字段信息:custname VARCHAR(16)
     */
    private String custname;

    /**
     * 字段名称：资金帐号
     * 
     * 数据库字段信息:fundid BIGINT(19)
     */
    private Long fundid;

    /**
     * 字段名称：货币代码
     * 
     * 数据库字段信息:moneytype CHAR(1)
     */
    private String moneytype;

    /**
     * 字段名称：客户类别
     * 
     * 数据库字段信息:custkind CHAR(1)
     */
    private String custkind;

    /**
     * 字段名称：客户分组
     * 
     * 数据库字段信息:custgroup CHAR(1)
     */
    private String custgroup;

    /**
     * 字段名称：资金发生数
     * 
     * 数据库字段信息:fundeffect DECIMAL(19,2)
     */
    private Double fundeffect;

    /**
     * 字段名称：资金本次余额
     * 
     * 数据库字段信息:fundbal DECIMAL(19,2)
     */
    private Double fundbal;

    /**
     * 字段名称：交易市场
     * 
     * 数据库字段信息:market CHAR(1)
     */
    private String market;

    /**
     * 字段名称：业务大类 0 非清算业务,1基金,2 非交易所债券3, 证券业务(注意：1、2、3都是晚上清算时候填入的，0是白天写的)
     * 
     * 数据库字段信息:biztype CHAR(1)
     */
    private String biztype;

    /**
     * 字段名称：证券码
     * 
     * 数据库字段信息:stkcode VARCHAR(16)
     */
    private String stkcode;

    /**
     * 字段名称：证券类别
     * 
     * 数据库字段信息:stktype CHAR(1)
     */
    private String stktype;

    /**
     * 字段名称：证券名称[或银行名称]
     * 
     * 数据库字段信息:stkname VARCHAR(16)
     */
    private String stkname;

    /**
     * 字段名称：证券发生数, (过户数量)
     * 
     * 数据库字段信息:stkeffect BIGINT(19)
     */
    private Long stkeffect;

    /**
     * 字段名称：证券余额
     * 
     * 数据库字段信息:stkbal BIGINT(19)
     */
    private Long stkbal;

    /**
     * 字段名称：委托数量
     * 
     * 数据库字段信息:orderqty BIGINT(19)
     */
    private Long orderqty;

    /**
     * 字段名称：委托价格
     * 
     * 数据库字段信息:orderprice BIGINT(19)
     */
    private Long orderprice;

    /**
     * 字段名称：委托日期
     * 
     * 数据库字段信息:orderdate INT(10)
     */
    private Long orderdate;

    /**
     * 字段名称：委托时间
     * 
     * 数据库字段信息:ordertime INT(10)
     */
    private Long ordertime;

    /**
     * 字段名称：成交数量(存被冲销的流水号)
     * 
     * 数据库字段信息:matchqty BIGINT(19)
     */
    private Long matchqty;

    /**
     * 字段名称：成交金额
     * 
     * 数据库字段信息:matchamt DECIMAL(19,2)
     */
    private Double matchamt;

    /**
     * 字段名称：成交笔数
     * 
     * 数据库字段信息:matchtimes INT(10)
     */
    private Long matchtimes;

    /**
     * 字段名称：成交价格
     * 
     * 数据库字段信息:matchprice DECIMAL(9,3)
     */
    private Double matchprice;

    /**
     * 字段名称：成交时间, (第一笔成交的时间)
     * 
     * 数据库字段信息:matchtime INT(10)
     */
    private Long matchtime;

    /**
     * 字段名称：净佣金
     * 
     * 数据库字段信息:fee_jsxf DECIMAL(12,2)
     */
    private Double feeJsxf;

    /**
     * 字段名称：佣金
     * 
     * 数据库字段信息:fee_sxf DECIMAL(12,2)
     */
    private Double feeSxf;

    /**
     * 字段名称：买卖类别
     * 
     * 数据库字段信息:bsflag CHAR(2)
     */
    private String bsflag;

    public Logasset() {
    }

    public Long getServerid() {
        return this.serverid;
    }

    public void setServerid(Long serverid) {
        this.serverid = serverid;
    }

    public Long getOperdate() {
        return this.operdate;
    }

    public void setOperdate(Long operdate) {
        this.operdate = operdate;
    }

    public Long getCleardate() {
        return this.cleardate;
    }

    public void setCleardate(Long cleardate) {
        this.cleardate = cleardate;
    }

    public Long getBizdate() {
        return this.bizdate;
    }

    public void setBizdate(Long bizdate) {
        this.bizdate = bizdate;
    }

    public Long getCustid() {
        return this.custid;
    }

    public void setCustid(Long custid) {
        this.custid = custid;
    }

    public String getCustname() {
        return this.custname;
    }

    public void setCustname(String custname) {
        this.custname = custname;
    }

    public Long getFundid() {
        return this.fundid;
    }

    public void setFundid(Long fundid) {
        this.fundid = fundid;
    }

    public String getMoneytype() {
        return this.moneytype;
    }

    public void setMoneytype(String moneytype) {
        this.moneytype = moneytype;
    }

    public String getCustkind() {
        return this.custkind;
    }

    public void setCustkind(String custkind) {
        this.custkind = custkind;
    }

    public String getCustgroup() {
        return this.custgroup;
    }

    public void setCustgroup(String custgroup) {
        this.custgroup = custgroup;
    }

    public Double getFundeffect() {
        return this.fundeffect;
    }

    public void setFundeffect(Double fundeffect) {
        this.fundeffect = fundeffect;
    }

    public Double getFundbal() {
        return this.fundbal;
    }

    public void setFundbal(Double fundbal) {
        this.fundbal = fundbal;
    }

    public String getMarket() {
        return this.market;
    }

    public void setMarket(String market) {
        this.market = market;
    }

    public String getBiztype() {
        return this.biztype;
    }

    public void setBiztype(String biztype) {
        this.biztype = biztype;
    }

    public String getStkcode() {
        return this.stkcode;
    }

    public void setStkcode(String stkcode) {
        this.stkcode = stkcode;
    }

    public String getStktype() {
        return this.stktype;
    }

    public void setStktype(String stktype) {
        this.stktype = stktype;
    }

    public String getStkname() {
        return this.stkname;
    }

    public void setStkname(String stkname) {
        this.stkname = stkname;
    }

    public Long getStkeffect() {
        return this.stkeffect;
    }

    public void setStkeffect(Long stkeffect) {
        this.stkeffect = stkeffect;
    }

    public Long getStkbal() {
        return this.stkbal;
    }

    public void setStkbal(Long stkbal) {
        this.stkbal = stkbal;
    }

    public Long getOrderqty() {
        return this.orderqty;
    }

    public void setOrderqty(Long orderqty) {
        this.orderqty = orderqty;
    }

    public Long getOrderprice() {
        return this.orderprice;
    }

    public void setOrderprice(Long orderprice) {
        this.orderprice = orderprice;
    }

    public Long getOrderdate() {
        return this.orderdate;
    }

    public void setOrderdate(Long orderdate) {
        this.orderdate = orderdate;
    }

    public Long getOrdertime() {
        return this.ordertime;
    }

    public void setOrdertime(Long ordertime) {
        this.ordertime = ordertime;
    }

    public Long getMatchqty() {
        return this.matchqty;
    }

    public void setMatchqty(Long matchqty) {
        this.matchqty = matchqty;
    }

    public Double getMatchamt() {
        return this.matchamt;
    }

    public void setMatchamt(Double matchamt) {
        this.matchamt = matchamt;
    }

    public Long getMatchtimes() {
        return this.matchtimes;
    }

    public void setMatchtimes(Long matchtimes) {
        this.matchtimes = matchtimes;
    }

    public Double getMatchprice() {
        return this.matchprice;
    }

    public void setMatchprice(Double matchprice) {
        this.matchprice = matchprice;
    }

    public Long getMatchtime() {
        return this.matchtime;
    }

    public void setMatchtime(Long matchtime) {
        this.matchtime = matchtime;
    }

    public Double getFeeJsxf() {
        return this.feeJsxf;
    }

    public void setFeeJsxf(Double feeJsxf) {
        this.feeJsxf = feeJsxf;
    }

    public Double getFeeSxf() {
        return this.feeSxf;
    }

    public void setFeeSxf(Double feeSxf) {
        this.feeSxf = feeSxf;
    }

    public String getBsflag() {
        return this.bsflag;
    }

    public void setBsflag(String bsflag) {
        this.bsflag = bsflag;
    }
}