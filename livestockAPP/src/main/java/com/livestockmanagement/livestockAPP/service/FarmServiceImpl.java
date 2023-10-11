package com.livestockmanagement.livestockAPP.service;

import com.livestockmanagement.livestockAPP.entity.Farm;
import com.livestockmanagement.livestockAPP.repository.FarmRepository;
import org.springframework.stereotype.Service;

@Service
public class FarmServiceImpl implements FarmService{
    private final FarmRepository farmRepository;

    public FarmServiceImpl(FarmRepository farmRepository) {
        this.farmRepository = farmRepository;
    }

    @Override
    public Farm addFarm(Farm farm) {
        return farmRepository.save(farm);
    }
}
