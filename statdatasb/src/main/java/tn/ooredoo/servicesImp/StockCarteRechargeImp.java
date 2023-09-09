package tn.ooredoo.servicesImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import tn.ooredoo.dao.StockCarteRechargeDao;
import tn.ooredoo.models.Stock_carte_recharge;
import tn.ooredoo.services.StockCarteRechargeService;


@Service
public class StockCarteRechargeImp implements StockCarteRechargeService {
    private final StockCarteRechargeDao stockCarteRechargeDao;
    @Autowired
    public  StockCarteRechargeImp( StockCarteRechargeDao stockCarteRechargeDao) {
        this.stockCarteRechargeDao = stockCarteRechargeDao;
    }

    @Override
    public  Page < Stock_carte_recharge >    getStockCarteRechargeBy (String mois, String cdDist, Integer mntRing, Integer nombre, Pageable pageable) {
        return stockCarteRechargeDao.getStockCarteRechargeBy (mois, cdDist, mntRing, nombre, pageable);
    }
}
