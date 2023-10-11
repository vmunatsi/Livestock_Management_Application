package com.livestockmanagement.livestockAPP.controller;

import com.livestockmanagement.livestockAPP.entity.Paddock;
import com.livestockmanagement.livestockAPP.service.PaddockService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class PaddockController {
    private final PaddockService paddockService;

    public PaddockController(PaddockService paddockService) {
        this.paddockService = paddockService;
    }

    @PostMapping("/paddock")
    public Paddock addPaddock(@RequestBody Paddock paddock){
        return paddockService.addPaddock(paddock);
    }


}
