package tn.ooredoo.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tn.ooredoo.models.Detail_livraison;

import java.sql.Date;

public interface DetailLivraisonDao extends JpaRepository < Detail_livraison, String> {

    @Query("SELECT n FROM Detail_livraison n " +
            "WHERE (:numSer IS NULL OR LOWER(n.numSer) LIKE LOWER(CONCAT('%', :numSer, '%'))) " +
            "AND (:msisdn IS NULL OR LOWER(n.msisdn) LIKE LOWER(CONCAT('%', :msisdn, '%'))) " +
            "AND (:mntRing IS NULL OR n.mntRing = :mntRing) " +
            "AND (:dateLivStart IS NULL OR n.dateLiv >= :dateLivStart) " +
            "AND (:dateLivEnd IS NULL OR n.dateLiv < :dateLivEnd) " +
            "AND (:dateFactStart IS NULL OR n.dateFact >= :dateFactStart) " +
            "AND (:dateFactEnd IS NULL OR n.dateFact < :dateFactEnd) " +
            "AND (:cdDist IS NULL OR LOWER(n.cdDist) = LOWER(:cdDist)) " +
            "AND (:recharge IS NULL OR n.recharge = :recharge) " +
            "AND (:mntDt IS NULL OR n.mntDt = :mntDt) " +
            "AND (:dateRechargeStart IS NULL OR n.dateRecharge >= :dateRechargeStart) " +
            "AND (:dateRechargeEnd IS NULL OR n.dateRecharge < :dateRechargeEnd) " +
            "AND (:flag1 IS NULL OR n.flag1 = :flag1) " +
            "AND (:flag2 IS NULL OR n.flag2 = :flag2) " +
            "AND (:flag3 IS NULL OR n.flag3 = :flag3) " +
            "AND (:flag4 IS NULL OR n.flag4 = :flag4)")
    Page<Detail_livraison> findByFilter(@Param("numSer") String numSer,
                                @Param("msisdn") String msisdn,
                                @Param("mntRing") Integer mntRing,
                                @Param("dateLivStart") Date dateLivStart,
                                @Param("dateLivEnd") Date dateLivEnd,
                                @Param("dateFactStart") Date dateFactStart,
                                @Param("dateFactEnd") Date dateFactEnd,
                                @Param("cdDist") String cdDist,
                                @Param("recharge") Character recharge,
                                @Param("mntDt") Integer mntDt,
                                @Param ("dateRechargeStart") Date dateRechargeStart,
                                @Param("dateRechargeEnd") Date dateRechargeEnd,
                                @Param("flag1") Character flag1,
                                @Param("flag2") Character flag2,
                                @Param("flag3") Character flag3,
                                @Param("flag4") Character flag4, Pageable pageable);
}
