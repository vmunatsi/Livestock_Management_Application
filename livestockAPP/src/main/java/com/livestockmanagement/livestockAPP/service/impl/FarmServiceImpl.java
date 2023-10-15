package com.livestockmanagement.livestockAPP.service.impl;

import com.livestockmanagement.livestockAPP.entity.Farm;
import com.livestockmanagement.livestockAPP.exception.FarmAlreadyExistException;
import com.livestockmanagement.livestockAPP.exception.ResourceNotFoundException;
import com.livestockmanagement.livestockAPP.repository.FarmRepository;
import com.livestockmanagement.livestockAPP.service.FarmService;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FarmServiceImpl implements FarmService {
    private final FarmRepository farmRepository;

    public FarmServiceImpl(FarmRepository farmRepository) {
        this.farmRepository = farmRepository;
    }
    @Override
    public Farm addFarm(Farm farm) {
        if (farmAlreadyExist(farm.getFarmName())){
            throw new FarmAlreadyExistException(farm.getFarmName() + " Farm already exist" );
        }
        return farmRepository.save(farm);

    }

    @Override
    public List <Farm> getAllFarms() {
        return farmRepository.findAll();
    }

    @Override
    public Farm getFarmById(Long id) {
        return farmRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException(" Farm is not available"));
    }


    @Override
    public Farm updateFarmById(Farm farm, Long id) {
        return farmRepository.findById(id).map(fm -> {
           fm.setFarmName(farm.getFarmName());
           fm.setFarmArea(farm.getFarmArea());
           return farmRepository.save(fm);
        }).orElseThrow(()->new ResourceNotFoundException("Farm is not found "  ));

    }

    @Override
    public void deleteFarm(Long id) {
        farmRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Farm is not found"));
        farmRepository.deleteById(id);

    }

    private boolean farmAlreadyExist(String farmName) {
        return farmRepository.findByFarmName(farmName).isPresent();
    }



}
