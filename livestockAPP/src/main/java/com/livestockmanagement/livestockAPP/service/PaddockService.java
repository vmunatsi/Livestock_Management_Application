package com.livestockmanagement.livestockAPP.service;

import com.livestockmanagement.livestockAPP.entity.Paddock;


import java.util.List;

public interface PaddockService {
    public Paddock addPaddock(Paddock paddock);
    public List<Paddock> getAllPaddocks();
    public Paddock getPaddockById(Long id);
    public Paddock updatePaddockById(Paddock paddock, Long id);
    public void deletePaddockById(Long id);
}
