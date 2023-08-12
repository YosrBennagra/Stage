package tn.ooredoo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.ooredoo.models.Recharge;
@Repository
public interface RechargeRepo extends JpaRepository < Recharge, String> {
}
