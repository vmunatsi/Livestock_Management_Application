package com.livestockmanagement.livestockAPP.service.impl;

import com.livestockmanagement.livestockAPP.entity.Farm;
import com.livestockmanagement.livestockAPP.entity.Paddock;
import com.livestockmanagement.livestockAPP.exception.PaddockAlreadyExistException;
import com.livestockmanagement.livestockAPP.exception.ResourceNotFoundException;
import com.livestockmanagement.livestockAPP.repository.PaddockRepository;
import com.livestockmanagement.livestockAPP.service.PaddockService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaddockServiceImpl implements PaddockService {
    private final PaddockRepository paddockRepository;

    public PaddockServiceImpl(PaddockRepository paddockRepository) {
        this.paddockRepository = paddockRepository;
    }

    @Override
    public Paddock addPaddock(Paddock paddock) {
        if(paddockAlreadyExist(paddock.getPaddockName())){
            throw new PaddockAlreadyExistException(" paddock already exist");
        }
        return paddockRepository.save(paddock);
    }

    @Override
    public List<Paddock> getAllPaddocks() {
        return paddockRepository.findAll();
    }

    @Override
    public Paddock getPaddockById(Long id) {
        return paddockRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Paddock not found"));
    }


    @Override
    public Paddock updatePaddockById(Paddock paddock, Long id) {
        return paddockRepository.findById(id).map(st->{
            st.setPaddockArea(paddock.getPaddockArea());
            st.setPaddockName(paddock.getPaddockName());
            return paddockRepository.save(st);
        }).orElseThrow(()-> new ResourceNotFoundException("The paddock is not available"));
    }

    @Override
    public void deletePaddockById(Long id) {
        paddockRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Paddock is not available"));
        paddockRepository.deleteById(id);
    }
    private boolean paddockAlreadyExist(String paddockName) {
        return paddockRepository.findByPaddockName(paddockName).isPresent();
    }


}
