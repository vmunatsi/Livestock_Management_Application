package com.livestockmanagement.livestockAPP.controller;

import com.livestockmanagement.livestockAPP.entity.Farm;
import com.livestockmanagement.livestockAPP.entity.Paddock;
import com.livestockmanagement.livestockAPP.service.PaddockService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/app")
public class PaddockController {
    private final PaddockService paddockService;

    public PaddockController(PaddockService paddockService) {
        this.paddockService = paddockService;
    }

    @PostMapping("/paddock")
    public ResponseEntity<Paddock> addPaddock(@RequestBody Paddock paddock) {
        return new ResponseEntity<>(paddockService.addPaddock(paddock), HttpStatus.CREATED);
    }
    @GetMapping("/paddock")
    public ResponseEntity<List<Paddock>> getAllPaddocks (){
        return new ResponseEntity<>(paddockService.getAllPaddocks(), HttpStatus.FOUND);
    }
    @GetMapping("/paddock/{id}")
    public ResponseEntity<Paddock> getPaddockById(@PathVariable("id") Long id){
        return new ResponseEntity<>(paddockService.getPaddockById(id), HttpStatus.FOUND);
    }
    @PutMapping("/paddock/{id}")
    public ResponseEntity<Paddock> updatePaddockById(@RequestBody Paddock paddock,@PathVariable("id") Long id){
        return new ResponseEntity<>(paddockService.updatePaddockById(paddock, id), HttpStatus.OK);
    }
    @DeleteMapping("/paddock/{id}")
    public ResponseEntity<String> deletePaddockById(@PathVariable("id") Long id){
        paddockService.deletePaddockById(id);
        return new ResponseEntity<>("Paddock deleted successfully", HttpStatus.OK);
    }

}
