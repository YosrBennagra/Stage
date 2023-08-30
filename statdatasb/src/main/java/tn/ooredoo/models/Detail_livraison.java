package tn.ooredoo.models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
@Entity
@Table (name = "DETAIL_LIVRAISON")
public class Detail_livraison {
    @Id
    private String numSer;
    @Column
    private Date dateLiv;
    @Column
    private Date dateFact;
    @Column
    private Integer mntRing; // Using Integer for NUMBER(2,0)
    @Column
    private String cdDist;
    @Column
    private Character recharge;
    @Column
    private String msisdn;
    @Column
    private Integer mntDt; // Using Integer for NUMBER(2,0)
    @Column
    private Date dateRecharge;
    @Column
    private Character flag1;
    @Column
    private Character flag2;
    @Column
    private Character flag3;
    @Column
    private Character flag4;

    public Detail_livraison (String numSer, Date dateLiv, Date dateFact, Integer mntRing, String cdDist, Character recharge, String msisdn, Integer mntDt, Date dateRecharge, Character flag1, Character flag2, Character flag3, Character flag4) {
        this.numSer = numSer;
        this.dateLiv = dateLiv;
        this.dateFact = dateFact;
        this.mntRing = mntRing;
        this.cdDist = cdDist;
        this.recharge = recharge;
        this.msisdn = msisdn;
        this.mntDt = mntDt;
        this.dateRecharge = dateRecharge;
        this.flag1 = flag1;
        this.flag2 = flag2;
        this.flag3 = flag3;
        this.flag4 = flag4;
    }

    public Detail_livraison ( ) {
    }

    public String getNumSer ( ) {
        return numSer;
    }

    public void setNumSer (String numSer) {
        this.numSer = numSer;
    }

    public Date getDateLiv ( ) {
        return dateLiv;
    }

    public void setDateLiv (Date dateLiv) {
        this.dateLiv = dateLiv;
    }

    public Date getDateFact ( ) {
        return dateFact;
    }

    public void setDateFact (Date dateFact) {
        this.dateFact = dateFact;
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

    public Date getDateRecharge ( ) {
        return dateRecharge;
    }

    public void setDateRecharge (Date dateRecharge) {
        this.dateRecharge = dateRecharge;
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

    @Override
    public String toString ( ) {
        return "detail_livraison{" +
                "numSer='" + numSer + '\'' +
                ", dateLiv=" + dateLiv +
                ", dateFact=" + dateFact +
                ", mntRing=" + mntRing +
                ", cdDist='" + cdDist + '\'' +
                ", recharge=" + recharge +
                ", msisdn='" + msisdn + '\'' +
                ", mntDt=" + mntDt +
                ", dateRecharge=" + dateRecharge +
                ", flag1=" + flag1 +
                ", flag2=" + flag2 +
                ", flag3=" + flag3 +
                ", flag4=" + flag4 +
                '}';
    }
}

