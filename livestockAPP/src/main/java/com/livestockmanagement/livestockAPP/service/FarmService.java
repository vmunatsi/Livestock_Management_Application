package com.livestockmanagement.livestockAPP.service;

import com.livestockmanagement.livestockAPP.entity.Farm;

import java.util.List;

public interface FarmService {
    public Farm addFarm(Farm farm);
    public List <Farm> getAllFarms();
    public Farm getFarmById(Long id);
    public Farm updateFarmById(Farm farm, Long id);
    public void deleteFarm(Long id);
}
