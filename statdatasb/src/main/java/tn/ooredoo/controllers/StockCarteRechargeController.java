package tn.ooredoo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import tn.ooredoo.models.Stock_carte_recharge;
import tn.ooredoo.services.StockCarteRechargeService;


import java.util.Collections;
import java.util.List;
@CrossOrigin (origins = "*")
@RestController
public class StockCarteRechargeController {
    private final StockCarteRechargeService stockCarteRechargeService;
    @Autowired
    public StockCarteRechargeController (StockCarteRechargeService stockCarteRechargeService) {
        this.stockCarteRechargeService = stockCarteRechargeService;
    }
    @RequestMapping (method = RequestMethod.GET, value = "/get_stock_carte_recharge")
    public List < Stock_carte_recharge > listAll() {
        try {
            return stockCarteRechargeService.getStockCarteRecharges();
        } catch (Exception e) {
            e.printStackTrace();
            return Collections.emptyList();
        }
    }
}
