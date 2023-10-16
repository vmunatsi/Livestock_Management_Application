package com.livestockmanagement.livestockAPP.controller;

import com.livestockmanagement.livestockAPP.entity.Treatment;
import com.livestockmanagement.livestockAPP.service.TreatmentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/app")
public class TreatmentController {

    private final TreatmentService treatmentService;

    public TreatmentController(TreatmentService treatmentService) {
        this.treatmentService = treatmentService;
    }
    @PostMapping("/treatment")
    public ResponseEntity<Treatment> addTreatment(@RequestBody Treatment treatment)
    {
        return new ResponseEntity<>( treatmentService.addTreatment(treatment), HttpStatus.OK);
    }
    @GetMapping("/treatment")
    public ResponseEntity<List<Treatment>> getAllTreatments(){
        return new ResponseEntity<>(treatmentService.getAllTreatment(),HttpStatus.OK);
    }

    @GetMapping("/treatment/{id}")
    public ResponseEntity<Treatment> getTreatmentById(@PathVariable("id") Long id){
        return new ResponseEntity<>(treatmentService.getTreatmentById(id), HttpStatus.OK);
    }
    @PostMapping("/treatment/{id}")
    public ResponseEntity<Treatment> updateTreatmentById(@RequestBody Treatment treatment, @PathVariable("id") Long id){
        return new ResponseEntity<>(treatmentService.updateTreatmentById(treatment, id), HttpStatus.OK);
    }

    @DeleteMapping("/treatment/{id}")
    public ResponseEntity<String> deleteTreatmentById(@PathVariable("id") Long id){
        treatmentService.deleteTreatmentById(id);
        return new ResponseEntity<>("Treatment deleted successfully", HttpStatus.OK);
    }
}
