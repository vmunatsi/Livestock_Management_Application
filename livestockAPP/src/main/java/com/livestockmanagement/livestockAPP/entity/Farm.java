package com.livestockmanagement.livestockAPP.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Farm {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long farmId;
    private String farmName;
    private long userId;
    private long farmArea;

    public Farm() {
    }

    public Farm(Integer farmId, String farmName, Integer userId, long farmArea) {
        this.farmId = farmId;
        this.farmName = farmName;
        this.userId = userId;
        this.farmArea = farmArea;
    }

    public long getFarmId() {
        return farmId;
    }

    public void setFarmId(int farmId) {
        this.farmId = farmId;
    }

    public String getFarmName() {
        return farmName;
    }

    public void setFarmName(String farmName) {
        this.farmName = farmName;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public long getFarmArea() {
        return farmArea;
    }

    public void setFarmArea(long farmArea) {
        this.farmArea = farmArea;
    }

    @Override
    public String toString() {
        return "Farm{" +
                "farmId=" + farmId +
                ", farmName='" + farmName + '\'' +
                ", userId=" + userId +
                ", farmArea=" + farmArea +
                '}';
    }
}
