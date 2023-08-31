package tn.ooredoo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;
import tn.ooredoo.dto.RechargeFilterDTO;
import tn.ooredoo.models.Recharge;
import tn.ooredoo.servicesImp.RechargeServiceImp;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class RechargeController {

    private final RechargeServiceImp rechargeServiceImp;
    @Autowired
    public RechargeController (RechargeServiceImp rechargeServiceImp) {
        this.rechargeServiceImp = rechargeServiceImp;
    }

    @PostMapping(value = "/getRechargeFiltredBy")
    public Page<Recharge> getRechargeFiltredBy(@RequestBody RechargeFilterDTO filterDTO, Pageable pageable) {
        System.out.println("Received Start Date: " + filterDTO.getDateRechargeStart());
        System.out.println("Received End Date: " + filterDTO.getGetDateRechargeEnd());
        return rechargeServiceImp.getRechargeFilteredBy(
                filterDTO.getVouchedId(),
                filterDTO.getRechargeAmount(),
                filterDTO.getMsisdn(),
                filterDTO.getDateRechargeStart(),
                filterDTO.getGetDateRechargeEnd(),
                pageable);
    }
}
