package tn.ooredoo.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import tn.ooredoo.models.Stock_carte_recharge;

import java.sql.Date;

public interface StockCarteRechargeService {
    Page < Stock_carte_recharge > getStockCarteRechargeBy(
            String mois, String cdDist, Integer mntRing, Integer nombre, Pageable pageable);
}
