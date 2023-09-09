package tn.ooredoo.dto;

import java.sql.Date;

public class DetailLivraisonDTO {
    private String numSer;
    private Date dateLivStart;
    private Date dateLivEnd;
    private Date dateFactStart;
    private Date dateFactEnd;
    private Integer mntRing;
    private String cdDist;
    private Character recharge;
    private String msisdn;
    private Integer mntDt;
    private Date dateRechargeStart;
    private Date dateRechargeEnd;
    private Character flag1;
    private Character flag2;
    private Character flag3;
    private Character flag4;

    public String getNumSer ( ) {
        return numSer;
    }

    public void setNumSer (String numSer) {
        this.numSer = numSer;
    }

    public Date getDateLivStart ( ) {
        return dateLivStart;
    }

    public void setDateLivStart (Date dateLivStart) {
        this.dateLivStart = dateLivStart;
    }

    public Date getDateLivEnd ( ) {
        return dateLivEnd;
    }

    public void setDateLivEnd (Date dateLivEnd) {
        this.dateLivEnd = dateLivEnd;
    }

    public Date getDateFactStart ( ) {
        return dateFactStart;
    }

    public void setDateFactStart (Date dateFactStart) {
        this.dateFactStart = dateFactStart;
    }

    public Date getDateFactEnd ( ) {
        return dateFactEnd;
    }

    public void setDateFactEnd (Date dateFactEnd) {
        this.dateFactEnd = dateFactEnd;
    }

    public Integer getMntRing ( ) {
        return mntRing;
    }

    public void setMntRing (Integer mntRing) {
        this.mntRing = mntRing;
    }

    public String getCdDist ( ) {
        return cdDist;
    }

    public void setCdDist (String cdDist) {
        this.cdDist = cdDist;
    }

    public Character getRecharge ( ) {
        return recharge;
    }

    public void setRecharge (Character recharge) {
        this.recharge = recharge;
    }

    public String getMsisdn ( ) {
        return msisdn;
    }

    public void setMsisdn (String msisdn) {
        this.msisdn = msisdn;
    }

    public Integer getMntDt ( ) {
        return mntDt;
    }

    public void setMntDt (Integer mntDt) {
        this.mntDt = mntDt;
    }

    public Date getDateRechargeStart ( ) {
        return dateRechargeStart;
    }

    public void setDateRechargeStart (Date dateRechargeStart) {
        this.dateRechargeStart = dateRechargeStart;
    }

    public Date getDateRechargeEnd ( ) {
        return dateRechargeEnd;
    }

    public void setDateRechargeEnd (Date dateRechargeEnd) {
        this.dateRechargeEnd = dateRechargeEnd;
    }

    public Character getFlag1 ( ) {
        return flag1;
    }

    public void setFlag1 (Character flag1) {
        this.flag1 = flag1;
    }

    public Character getFlag2 ( ) {
        return flag2;
    }

    public void setFlag2 (Character flag2) {
        this.flag2 = flag2;
    }

    public Character getFlag3 ( ) {
        return flag3;
    }

    public void setFlag3 (Character flag3) {
        this.flag3 = flag3;
    }

    public Character getFlag4 ( ) {
        return flag4;
    }

    public void setFlag4 (Character flag4) {
        this.flag4 = flag4;
    }
}
