package tn.ooredoo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "STOCK_CARTE_RECHARGE")
public class Stock_carte_recharge {
    @Column
    private String mois;
    @Id
    private String cdDist;
    @Column
    private Integer mntRing;
    @Column
    private Integer nombre;

    public Stock_carte_recharge (String mois, String cdDist, Integer mntRing, Integer nombre) {
        this.mois = mois;
        this.cdDist = cdDist;
        this.mntRing = mntRing;
        this.nombre = nombre;
    }

    public Stock_carte_recharge ( ) {
    }

    public String getMois ( ) {
        return mois;
    }

    public void setMois (String mois) {
        this.mois = mois;
    }

    public String getCdDist ( ) {
        return cdDist;
    }

    public void setCdDist (String cdDist) {
        this.cdDist = cdDist;
    }

    public Integer getMntRing ( ) {
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

    @Override
    public String toString ( ) {
        return "stock_carte_recharge{" +
                "mois='" + mois + '\'' +
                ", cdDist='" + cdDist + '\'' +
                ", mntRing=" + mntRing +
                ", nombre=" + nombre +
                '}';
    }
}
