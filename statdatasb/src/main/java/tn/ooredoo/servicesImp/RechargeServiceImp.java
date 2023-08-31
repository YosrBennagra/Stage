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
    private final RechargeDao rechargeRepository;
    @Autowired
    public RechargeServiceImp(RechargeDao rechargeRepository) {
        this.rechargeRepository = rechargeRepository;
    }
    @Override
    public Page<Recharge> getRechargeFilteredBy(
            String voucherId,
            Integer rechargeAmount,
            String msisdn,
            Date dateRechargeStart,
            Date dateRechargeEnd,
            Pageable pageable) {
        return rechargeRepository.getFilteredRecharges(voucherId, rechargeAmount, msisdn, dateRechargeStart, dateRechargeEnd, pageable);
    }
}
