package com.livestockmanagement.livestockAPP.service;

import com.livestockmanagement.livestockAPP.entity.Treatment;

import java.util.List;

public interface TreatmentService {
    public Treatment addTreatment(Treatment treatment);
    public List<Treatment> getAllTreatment();
    public Treatment getTreatmentById(Long id);
    public Treatment updateTreatmentById (Treatment treatment, Long id);
    public void deleteTreatmentById(Long id);
}
