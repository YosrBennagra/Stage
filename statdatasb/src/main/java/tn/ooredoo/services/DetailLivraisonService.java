package tn.ooredoo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.ooredoo.models.Detail_livraison;
import tn.ooredoo.repositories.DetailLivraisonRepo;

import java.util.List;
@Service
public class DetailLivraisonService {

    private DetailLivraisonRepo detailLivraisonRepo;

    @Autowired
    public DetailLivraisonService (DetailLivraisonRepo detailLivraisonRepo) {
        this.detailLivraisonRepo = detailLivraisonRepo;
    }

    public List < Detail_livraison > getDetailLivraisons() {
        return (List < Detail_livraison >) detailLivraisonRepo.findAll();
    }
}
