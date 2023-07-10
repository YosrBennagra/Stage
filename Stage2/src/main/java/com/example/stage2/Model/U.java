package com.example.stage2.Model;

import jakarta.persistence.*;

@Entity
@Table (name = "UTILISATEUR")
public class U {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String nom;

    @Column
    private String mdp;
//first_name , last, login, password, rigel ism les fichier w kol chay bl englais, maach testa3mel pathvariable , zid try catch.w dima esta3mel post,
    //f langular a3mel formulaire ajouter,
    public U ( ) {
    }

    public U (Long id, String nom, String mdp) {
        super();
        this.id = id;
        this.nom = nom;
        this.mdp = mdp;
    }

    public Long getId ( ) {
        return id;
    }

    public void setId (Long id) {
        this.id = id;
    }

    public String getNom ( ) {
        return nom;
    }

    public void setNom (String nom) {
        this.nom = nom;
    }

    public String getMdp ( ) {
        return mdp;
    }

    public void setMdp (String mdp) {
        this.mdp = mdp;
    }

    @Override
    public String toString ( ) {
        return "U{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", mdp='" + mdp + '\'' +
                '}';
    }
}
