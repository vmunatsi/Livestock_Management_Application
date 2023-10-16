package com.livestockmanagement.livestockAPP.service.impl;

import com.livestockmanagement.livestockAPP.entity.Treatment;
import com.livestockmanagement.livestockAPP.exception.ResourceNotFoundException;
import com.livestockmanagement.livestockAPP.repository.TreatmentRepository;
import com.livestockmanagement.livestockAPP.service.TreatmentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TreatmentServiceImpl implements TreatmentService {

    private final TreatmentRepository treatmentRepository;

    public TreatmentServiceImpl(TreatmentRepository treatmentRepository) {
        this.treatmentRepository = treatmentRepository;

    }

    @Override
    public Treatment addTreatment(Treatment treatment) {
        return treatmentRepository.save(treatment);
    }

    @Override
    public List<Treatment> getAllTreatment() {
        return treatmentRepository.findAll();
    }

    @Override
    public Treatment getTreatmentById(Long id) {
        return treatmentRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Treatment not available"));
    }

    @Override
    public Treatment updateTreatmentById(Treatment treatment, Long id) {
        return treatmentRepository.findById(id).map(treatment1 -> {
            treatment1.setTreatmentName(treatment.getTreatmentName());
            treatment1.setBoosterDays(treatment.getBoosterDays());
            treatment1.setWithdrawalDays(treatment.getWithdrawalDays());
            treatment1.setDosage(treatment.getDosage());
            treatment1.setDescription(treatment.getDescription());
            return treatmentRepository.save(treatment1);
        }).orElseThrow(()-> new ResourceNotFoundException("Treatment not available"));
    }

    @Override
    public void deleteTreatmentById(Long id) {
        treatmentRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Treatment not available"));
        treatmentRepository.deleteById(id);
    }
}
