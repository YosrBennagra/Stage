package tn.ooredoo.servicesImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import tn.ooredoo.dao.DetailLivraisonDao;
import tn.ooredoo.dao.RechargeDao;
import tn.ooredoo.models.Detail_livraison;
import tn.ooredoo.services.DetailLivraisonService;

import java.sql.Date;
@Service
public class DetailLivraisonImp implements DetailLivraisonService {

    private final DetailLivraisonDao detailLivraisonDao;
    @Autowired
    public DetailLivraisonImp(DetailLivraisonDao detailLivraisonDao) {
        this.detailLivraisonDao = detailLivraisonDao;
    }

    @Override
    public Page < Detail_livraison > getDetailLivraisonFilteredBy (String numSer,
                                                            Date dateLivStart,
                                                            Date dateLivEnd,
                                                            Date dateFactStart,
                                                            Date dateFactEnd,
                                                            Integer mntRing,
                                                            String cdDist,
                                                            Character recharge,
                                                            String msisdn,
                                                            Integer mntDt,
                                                            Date dateRechargeStart,
                                                            Date dateRechargeEnd,
                                                            Character flag1,
                                                            Character flag2,
                                                            Character flag3,
                                                            Character flag4,
                                                            Pageable pageable) {
        return detailLivraisonDao.findByFilter (
                numSer ,
                msisdn ,
                mntRing ,
                dateLivStart ,
                dateLivEnd ,
                dateFactStart ,
                dateFactEnd ,
                cdDist ,
                recharge ,
                mntDt ,
                dateRechargeStart ,
                dateRechargeEnd ,
                flag1 ,
                flag2 ,
                flag3 ,
                flag4 ,
                pageable);
    }
}
