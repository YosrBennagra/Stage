package tn.ooredoo.dto;



public class StockCarteRechargeDTO {

    private String mois;

    private String cdDist;

    private Integer mntRing;

    private Integer nombre;

    public String getMois ( ) {
        return mois;
    }

    public void setMois (String mois) {
        this.mois = mois;
    }

    public String getCdDist () {
        return cdDist;
    }

    public void setCdDist (String cdDist) {
        this.cdDist = cdDist;
    }

    public Integer getMntRing () {
        return mntRing;
    }

    public void setMntRing (Integer mntRing) {
        this.mntRing = mntRing;
    }

    public Integer getNombre ( ) {
        return nombre;
    }

    public void setNombre (Integer nombre) {
        this.nombre = nombre;
    }
}
