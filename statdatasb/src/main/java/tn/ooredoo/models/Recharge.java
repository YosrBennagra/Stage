package tn.ooredoo.models;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table (name = "RECHARGE")
public class Recharge {
    @Id
    private String voucherId;
    @Column
    private int rechargeAmount;
    @Column
    private String msisdn;
    @Column
    private Date dateRecharge;

    public Recharge (String voucherId, int rechargeAmount, String msisdn, Date dateRecharge) {
        this.voucherId = voucherId;
        this.rechargeAmount = rechargeAmount;
        this.msisdn = msisdn;
        this.dateRecharge = dateRecharge;
    }

    public Recharge ( ) {
    }

    public String getVoucherId ( ) {
        return voucherId;
    }

    public void setVoucherId (String voucherId) {
        this.voucherId = voucherId;
    }

    public int getRechargeAmount ( ) {
        return rechargeAmount;
    }

    public void setRechargeAmount (int rechargeAmount) {
        this.rechargeAmount = rechargeAmount;
    }

    public String getMsisdn ( ) {
        return msisdn;
    }

    public void setMsisdn (String msisdn) {
        this.msisdn = msisdn;
    }

    public Date getDateRecharge ( ) {
        return dateRecharge;
    }

    public void setDateRecharge (Date dateRecharge) {
        this.dateRecharge = dateRecharge;
    }

    @Override
    public String toString ( ) {
        return "recharge{" +
                "voucherId='" + voucherId + '\'' +
                ", rechargeAmount=" + rechargeAmount +
                ", msisdn='" + msisdn + '\'' +
                ", dateRecharge=" + dateRecharge +
                '}';
    }
}
