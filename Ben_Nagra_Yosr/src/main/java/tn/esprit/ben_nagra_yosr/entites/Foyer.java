package tn.esprit.ben_nagra_yosr.entites;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Set;


@Getter
@Setter

@Entity
public class Foyer implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idFoyer;
    private String nomBloc;
    private Long capacitebloc;

    @OneToOne(mappedBy = "foyer")
    private Universite universite;

    @OneToMany(mappedBy = "foyer")
    private Set<Bloc> blocs;

}