package tn.ooredoo.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.ooredoo.models.Recharge;
@Repository
public interface RechargeRepo extends JpaRepository < Recharge, String> {
    Page <Recharge> findAll(Specification <Recharge> produitsSpecification, Pageable pageable);

}
