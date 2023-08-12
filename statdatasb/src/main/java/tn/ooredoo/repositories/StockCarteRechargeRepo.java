package tn.ooredoo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.ooredoo.models.Stock_carte_recharge;

@Repository
public interface StockCarteRechargeRepo  extends JpaRepository < Stock_carte_recharge, String> {
}
