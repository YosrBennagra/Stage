package tn.ooredoo.servicesImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import tn.ooredoo.dao.RechargeDao;
import tn.ooredoo.models.Recharge;
import tn.ooredoo.services.RechargeService;

import java.sql.Date;

@Service
public class RechargeServiceImp  implements RechargeService {
    private final RechargeDao rechargeDao;
    @Autowired
    public RechargeServiceImp(RechargeDao rechargeRepository) {
        this.rechargeDao = rechargeRepository;
    }
    @Override
    public Page<Recharge> getRechargeFilteredBy(
            String voucherId,
            Integer rechargeAmount,
            String msisdn,
            Date dateRechargeStart,
            Date dateRechargeEnd,
            Pageable pageable) {
        if (dateRechargeEnd != null){
            Date tomorrow = new Date(dateRechargeEnd.getTime() + 24 * 60 * 60 * 1000);
            return rechargeDao.getFilteredRecharges(voucherId, rechargeAmount, msisdn, dateRechargeStart, tomorrow, pageable);

        }else
            return rechargeDao.getFilteredRecharges(voucherId, rechargeAmount, msisdn, dateRechargeStart, dateRechargeEnd, pageable);

    }
}
