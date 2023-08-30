package tn.ooredoo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import tn.ooredoo.models.Recharge;
import tn.ooredoo.repositories.RechargeRepo;

import javax.persistence.criteria.Predicate;
import java.util.ArrayList;
import java.util.Date;
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

    public Page<Recharge> geRechargeFiltredBy(String voucherId, Integer rechargeAmount, String msisdn, Date dateRechargeStart, Date dateRechargeEnd, Pageable pageable){
        Page<Recharge> RechargePage = rechargeRepo.findAll((Specification <Recharge>) (root, query, criteriaBuilder) -> {
            List< Predicate > predicates = new ArrayList <> ();

            if (voucherId != null && !voucherId.isEmpty()) {
                predicates.add(criteriaBuilder.like(criteriaBuilder.lower(root.get("voucherId")), "%" + voucherId.toLowerCase() + "%"));
            }
            if (msisdn != null && !msisdn.isEmpty()) {
                predicates.add(criteriaBuilder.like(criteriaBuilder.lower(root.get("msisdn")), "%" + msisdn.toLowerCase() + "%"));
            }
            if (rechargeAmount != null) {
                predicates.add(criteriaBuilder.equal(root.get("rechargeAmount"), rechargeAmount));
            }
            if (dateRechargeStart != null && dateRechargeEnd != null) {
                predicates.add(criteriaBuilder.between(root.get("dateRecharge"), dateRechargeStart, dateRechargeEnd));
            }
            System.out.println("Start Date: " + dateRechargeStart);
            System.out.println("End Date: " + dateRechargeEnd);

            return criteriaBuilder.and(predicates.toArray(new Predicate[0]));
        }, pageable);


        return RechargePage;
    }

}

