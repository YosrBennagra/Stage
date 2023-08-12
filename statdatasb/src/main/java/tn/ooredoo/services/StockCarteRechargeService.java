package tn.ooredoo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.ooredoo.models.Recharge;
import tn.ooredoo.models.Stock_carte_recharge;
import tn.ooredoo.repositories.StockCarteRechargeRepo;

import java.util.List;
@Service
public class StockCarteRechargeService {
    private StockCarteRechargeRepo stockCarteRechargeRepo;

    @Autowired
    public StockCarteRechargeService (StockCarteRechargeRepo stockCarteRechargeRepo) {
        this.stockCarteRechargeRepo = stockCarteRechargeRepo;
    }

    public List < Stock_carte_recharge > getStockCarteRecharges() {
        return (List < Stock_carte_recharge >) stockCarteRechargeRepo.findAll();
    }


}
