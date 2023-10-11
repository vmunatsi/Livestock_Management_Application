package com.livestockmanagement.livestockAPP.service;

import com.livestockmanagement.livestockAPP.entity.Paddock;
import com.livestockmanagement.livestockAPP.repository.PaddockRepository;
import org.springframework.stereotype.Service;
@Service
public class PaddockServiceImpl implements PaddockService{
    private final PaddockRepository paddockRepository;

    public PaddockServiceImpl(PaddockRepository paddockRepository) {
        this.paddockRepository = paddockRepository;
    }

    @Override
    public Paddock addPaddock(Paddock paddock) {
        return paddockRepository.save(paddock);
    }
}
