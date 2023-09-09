package tn.ooredoo.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import tn.ooredoo.models.Detail_livraison;

import java.sql.Date;


public interface DetailLivraisonService {

    Page < Detail_livraison > getDetailLivraisonFilteredBy(
            String numSer,
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
            Pageable pageable);
}
