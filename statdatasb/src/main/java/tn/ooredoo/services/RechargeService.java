package tn.ooredoo.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import tn.ooredoo.dao.RechargeDao;
import tn.ooredoo.models.Recharge;

import java.sql.Date;

public interface RechargeService  {

    Page<Recharge> getRechargeFilteredBy(
            String voucherId, Integer rechargeAmount, String msisdn, Date dateRechargeStart, Date dateRechargeEnd, Pageable pageable);

}
