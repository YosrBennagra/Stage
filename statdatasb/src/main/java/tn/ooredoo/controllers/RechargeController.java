package tn.ooredoo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import tn.ooredoo.models.Recharge;
import tn.ooredoo.services.RechargeService;

import java.util.Collections;
import java.util.Date;
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

    @GetMapping(value = "/geRechargeFiltredBy")
    public Page<Recharge> geRechargeFiltredBy(@RequestParam(value = "voucherId",required = false) String voucherId,
                                              @RequestParam(value = "rechargeAmount",required = false) Integer rechargeAmount,
                                              @RequestParam(value = "msisdn",required = false) String msisdn,
                                              @RequestParam(value = "dateRechargeStart", required = false) @DateTimeFormat(pattern = "yyyy-MM-dd") Date dateRechargeStart,
                                              @RequestParam(value = "dateRechargeEnd", required = false) @DateTimeFormat(pattern = "yyyy-MM-dd") Date dateRechargeEnd,
                                              Pageable pageable){
        System.out.println("Received Start Date: " + dateRechargeStart);
        System.out.println("Received End Date: " + dateRechargeEnd);
        return rechargeService.geRechargeFiltredBy (voucherId,rechargeAmount,msisdn,dateRechargeStart,dateRechargeEnd,pageable);
    }
}
