package tn.ooredoo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import tn.ooredoo.models.Detail_livraison;
import tn.ooredoo.services.DetailLivraisonService;

import java.util.Collections;
import java.util.List;

@CrossOrigin (origins = "*")
@RestController

public class DetailLivraisonController {
    private final DetailLivraisonService detailLivraisonService;
    @Autowired
    public DetailLivraisonController (DetailLivraisonService detailLivraisonService) {
        this.detailLivraisonService = detailLivraisonService;
    }
    @RequestMapping (method = RequestMethod.GET, value = "/get_detail_livraison")
    public List < Detail_livraison > listAll() {
        try {
            return detailLivraisonService.getDetailLivraisons();
        } catch (Exception e) {
            e.printStackTrace();
            return Collections.emptyList();
        }
    }
}
