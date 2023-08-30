package tn.ooredoo.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.ooredoo.models.Detail_livraison;


@Repository
public interface DetailLivraisonRepo extends JpaRepository < Detail_livraison, String> {
}
