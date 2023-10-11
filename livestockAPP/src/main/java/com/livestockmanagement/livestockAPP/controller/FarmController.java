package com.livestockmanagement.livestockAPP.controller;

import com.livestockmanagement.livestockAPP.entity.Farm;
import com.livestockmanagement.livestockAPP.service.FarmService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class FarmController {
    private final FarmService farmService;

    public FarmController(FarmService farmService) {
        this.farmService = farmService;
    }
    @PostMapping("/farm")
    public Farm addFarm(@RequestBody Farm farm){
        return farmService.addFarm(farm);
    }

}
