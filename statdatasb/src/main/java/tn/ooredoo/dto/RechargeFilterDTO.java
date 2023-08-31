package tn.ooredoo.dto;


import java.sql.Date;

public class RechargeFilterDTO {
    private String vouchedId;
    private Integer rechargeAmount;
    private String msisdn;
    private Date dateRechargeStart;
    private Date getDateRechargeEnd;

    public String getVouchedId() {
        return vouchedId;
    }

    public void setVouchedId(String vouchedId) {
        this.vouchedId = vouchedId;
    }

    public Integer getRechargeAmount() {
        return rechargeAmount;
    }

    public void setRechargeAmount(Integer rechargeAmount) {
        this.rechargeAmount = rechargeAmount;
    }

    public String getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }

    public Date getDateRechargeStart() {
        return dateRechargeStart;
    }

    public void setDateRechargeStart(Date dateRechargeStart) {
        this.dateRechargeStart = dateRechargeStart;
    }

    public Date getGetDateRechargeEnd() {
        return getDateRechargeEnd;
    }

    public void setGetDateRechargeEnd(Date getDateRechargeEnd) {
        this.getDateRechargeEnd = getDateRechargeEnd;
    }
}
