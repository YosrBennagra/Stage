package tn.ooredoo.dto;


import java.sql.Date;

public class RechargeFilterDTO {
    private String voucherId;
    private Integer rechargeAmount;
    private String msisdn;
    private Date dateRechargeStart;
    private Date dateRechargeEnd;

    public String getVoucherId() {
        return voucherId;
    }

    public void setVoucherId(String voucherId) {
        this.voucherId = voucherId;
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

    public Date getDateRechargeEnd() {
        return dateRechargeEnd;
    }

    public void setGetDateRechargeEnd(Date getDateRechargeEnd) {
        this.dateRechargeEnd = getDateRechargeEnd;
    }

    @Override
    public String toString ( ) {
        return "RechargeFilterDTO{" +
                "voucherId='" + voucherId + '\'' +
                ", rechargeAmount=" + rechargeAmount +
                ", msisdn='" + msisdn + '\'' +
                ", dateRechargeStart=" + dateRechargeStart +
                ", DateRechargeEnd=" + dateRechargeEnd +
                '}';
    }
}
