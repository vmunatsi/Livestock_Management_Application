package com.livestockmanagement.livestockAPP.entity;

import javax.persistence.*;

@Entity
@Table(name = "paddock")
public class Paddock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long paddockId;
    private String paddockName;
    private long paddockArea;
    private long farmId;

    public Paddock() {
    }

    public Paddock(long paddockId, String paddockName, long paddockArea, long farmId) {
        this.paddockId = paddockId;
        this.paddockName = paddockName;
        this.paddockArea = paddockArea;
        this.farmId = farmId;
    }

    public long getPaddockId() {
        return paddockId;
    }

    public void setPaddockId(long paddockId) {
        this.paddockId = paddockId;
    }

    public String getPaddockName() {
        return paddockName;
    }

    public void setPaddockName(String paddockName) {
        this.paddockName = paddockName;
    }

    public long getPaddockArea() {
        return paddockArea;
    }

    public void setPaddockArea(long paddockArea) {
        this.paddockArea = paddockArea;
    }

    public long getFarmId() {
        return farmId;
    }

    public void setFarmId(long farmId) {
        this.farmId = farmId;
    }

    @Override
    public String toString() {
        return "Paddock{" +
                "paddockId=" + paddockId +
                ", paddockName='" + paddockName + '\'' +
                ", paddockArea=" + paddockArea +
                ", farmId=" + farmId +
                '}';
    }
}
