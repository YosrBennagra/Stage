package tn.ooredoo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.ooredoo.models.Recharge;
import tn.ooredoo.repositories.RechargeRepo;

import java.util.List;
@Service
public class RechargeService {
    private RechargeRepo rechargeRepo;

    @Autowired
    public RechargeService (RechargeRepo rechargeRepo) {
        this.rechargeRepo = rechargeRepo;
    }

    public List < Recharge > getRecharges() {
        return (List < Recharge >) rechargeRepo.findAll();
    }
}
