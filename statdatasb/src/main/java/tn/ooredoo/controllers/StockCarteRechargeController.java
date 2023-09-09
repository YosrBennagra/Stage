package tn.ooredoo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;
import tn.ooredoo.dto.StockCarteRechargeDTO;

import tn.ooredoo.models.Stock_carte_recharge;
import tn.ooredoo.servicesImp.StockCarteRechargeImp;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class StockCarteRechargeController {

    private final StockCarteRechargeImp stockCarteRechargeImp;
    @Autowired
    public StockCarteRechargeController (StockCarteRechargeImp stockCarteRechargeImp) {
        this.stockCarteRechargeImp = stockCarteRechargeImp;
    }
    @PostMapping(value = "/getStockCarteRechargeBy")
    public Page<Stock_carte_recharge> getStockCarteRechargeBy(@RequestBody StockCarteRechargeDTO filterDTO, Pageable pageable){
        return stockCarteRechargeImp.getStockCarteRechargeBy(
                filterDTO.getMois(),
                filterDTO.getCdDist(),
                filterDTO.getMntRing(),
                filterDTO.getNombre(),
                pageable);
    }



}
