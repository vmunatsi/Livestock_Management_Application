package com.livestockmanagement.livestockAPP.controller;

import com.livestockmanagement.livestockAPP.entity.Farm;
import com.livestockmanagement.livestockAPP.service.FarmService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/app")
public class FarmController {
    private final FarmService farmService;

    public FarmController(FarmService farmService) {
        this.farmService = farmService;
    }
    @PostMapping("/farm")
    public ResponseEntity<Farm> addFarm(@RequestBody Farm farm){
        return new ResponseEntity<>(farmService.addFarm(farm), HttpStatus.CREATED);
    }
    @GetMapping("/farm")
    public ResponseEntity<List<Farm>> getAllFarms (){
        return new ResponseEntity<>(farmService.getAllFarms(), HttpStatus.FOUND);
    }
    @GetMapping("/farm/{id}")
    public ResponseEntity<Farm> getFarmById(@PathVariable("id") Long id){
        return  new ResponseEntity<>(farmService.getFarmById(id), HttpStatus.FOUND);
    }
    @PutMapping("farm/{id}")
    public ResponseEntity <Farm> updateFarmById (@RequestBody Farm farm,@PathVariable("id") Long id){
        return new ResponseEntity<>(farmService.updateFarmById(farm, id), HttpStatus.OK);
    }
    @DeleteMapping("/farm/{id}")
    public ResponseEntity<String> deleteFarm (@PathVariable("id") Long id){
        farmService.deleteFarm(id);
        return new ResponseEntity<>("Farm deleted successfully", HttpStatus.OK);
    }
}
