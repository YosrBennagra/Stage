package tn.ooredoo.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tn.ooredoo.models.Stock_carte_recharge;

import java.sql.Date;

public interface StockCarteRechargeDao  extends JpaRepository < Stock_carte_recharge, String> {

    @Query("SELECT n FROM Stock_carte_recharge n " +
            "WHERE (:mois IS NULL OR LOWER(n.mois) LIKE LOWER(CONCAT('%', :mois, '%'))) " +
            "AND (:cdDist IS NULL OR LOWER(n.cdDist) = LOWER(:cdDist)) " +
            "AND (:mntRing IS NULL OR n.mntRing = :mntRing) " +
            "AND (:nombre IS NULL OR n.nombre = :nombre)")
    Page<Stock_carte_recharge> getStockCarteRechargeBy(@Param ("mois") String mois,
                                                 @Param("cdDist") String cdDist,
                                                 @Param("mntRing") Integer mntRing,
                                                 @Param("nombre") Integer nombre, Pageable pageable);


}
