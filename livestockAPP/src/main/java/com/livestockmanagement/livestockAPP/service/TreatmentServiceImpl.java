package com.livestockmanagement.livestockAPP.service;

import com.livestockmanagement.livestockAPP.entity.Treatment;
import com.livestockmanagement.livestockAPP.repository.TreatmentRepository;
import org.springframework.stereotype.Service;

@Service
public class TreatmentServiceImpl implements TreatmentService{

    private final TreatmentRepository treatmentRepository;

    public TreatmentServiceImpl(TreatmentRepository treatmentRepository) {
        this.treatmentRepository = treatmentRepository;

    }

    @Override
    public Treatment addTreatment(Treatment treatment) {
        return treatmentRepository.save(treatment);
    }
}
