package tn.esprit.ben_nagra_yosr.entites;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
@Getter
@Setter

@Entity
public class Universite implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long idFoyer;
    private String nomFoyer;
    private String capaciteFoyer;
    @OneToOne
    private Foyer foyer;
}
