package tn.ooredoo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import tn.ooredoo.models.Recharge;
import tn.ooredoo.services.RechargeService;

import java.util.Collections;
import java.util.List;

@CrossOrigin (origins = "*")
@RestController

public class RechargeController {

    private final RechargeService rechargeService;
    @Autowired
    public RechargeController (RechargeService rechargeService) {
        this.rechargeService = rechargeService;
    }
    @RequestMapping (method = RequestMethod.GET, value = "/getrecharges")
    public List < Recharge > listAll() {
        try {
            return rechargeService.getRecharges();
        } catch (Exception e) {
            e.printStackTrace();
            return Collections.emptyList();
        }
    }
}
