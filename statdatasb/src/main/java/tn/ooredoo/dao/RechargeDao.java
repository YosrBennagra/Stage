package tn.ooredoo.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import tn.ooredoo.models.Recharge;
import java.sql.Date;
import org.springframework.data.domain.Pageable;

public interface RechargeDao  extends JpaRepository<Recharge, String> {

    @Query("SELECT r FROM Recharge r " +
            "WHERE (:voucherId IS NULL OR LOWER(r.voucherId) LIKE LOWER(CONCAT('%', :voucherId, '%'))) " +
            "AND (:msisdn IS NULL OR LOWER(r.msisdn) LIKE LOWER(CONCAT('%', :msisdn, '%'))) " +
            "AND (:rechargeAmount IS NULL OR r.rechargeAmount = :rechargeAmount) " +
            "AND (:dateRechargeStart IS NULL OR r.dateRecharge >= :dateRechargeStart) " +
            "AND (:dateRechargeEnd IS NULL OR r.dateRecharge < :dateRechargeEnd)")
    Page<Recharge> getFilteredRecharges(String voucherId, Integer rechargeAmount, String msisdn, Date dateRechargeStart, Date dateRechargeEnd, Pageable pageable);

}

