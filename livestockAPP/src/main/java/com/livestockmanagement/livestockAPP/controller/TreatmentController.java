package com.livestockmanagement.livestockAPP.controller;

import com.livestockmanagement.livestockAPP.entity.Treatment;
import com.livestockmanagement.livestockAPP.service.TreatmentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class TreatmentController {

    private final TreatmentService treatmentService;

    public TreatmentController(TreatmentService treatmentService) {
        this.treatmentService = treatmentService;
    }
    @PostMapping("/treatment")
    public Treatment addTreatment(@RequestBody Treatment treatment)
    {
        return treatmentService.addTreatment(treatment);
    }
}
