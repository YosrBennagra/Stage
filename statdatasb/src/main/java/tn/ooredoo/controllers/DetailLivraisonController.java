package tn.ooredoo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;
import tn.ooredoo.dto.DetailLivraisonDTO;
import tn.ooredoo.models.Detail_livraison;
import tn.ooredoo.servicesImp.DetailLivraisonImp;

@CrossOrigin(origins = "http://localhost:4200")
@RestController

public class DetailLivraisonController {
    private final DetailLivraisonImp detailLivraisonImp;
    @Autowired
    public DetailLivraisonController (DetailLivraisonImp detailLivraisonImp) {
        this.detailLivraisonImp = detailLivraisonImp;
    }

    @PostMapping (value = "/getDetailLivraisonFiltredBy")
    public Page < Detail_livraison > getDetailLivraisonBy (@RequestBody DetailLivraisonDTO filterDTO, Pageable pageable) {
        return detailLivraisonImp.getDetailLivraisonFilteredBy (
                filterDTO.getNumSer (),
                filterDTO.getDateLivStart (),
                filterDTO.getDateLivEnd (),
                filterDTO.getDateFactStart (),
                filterDTO.getDateFactEnd (),
                filterDTO.getMntRing (),
                filterDTO.getCdDist (),
                filterDTO.getRecharge (),
                filterDTO.getMsisdn (),
                filterDTO.getMntDt (),
                filterDTO.getDateRechargeStart (),
                filterDTO.getDateRechargeEnd (),
                filterDTO.getFlag1 (),
                filterDTO.getFlag2 (),
                filterDTO.getFlag3 (),
                filterDTO.getFlag4 (),
                pageable);

    }
}
