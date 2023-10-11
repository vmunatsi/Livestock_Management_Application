package com.livestockmanagement.livestockAPP.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Treatment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long treatmentId;
    private String treatmentName;
    private int boosterDays;
    private int withdrawalDays;
    private double dosage;
    private String description;

    public Treatment() {
    }

    public Treatment(long treatmentId, String treatmentName, int boosterDays, int withdrawalDays, double dosage, String description) {
        this.treatmentId = treatmentId;
        this.treatmentName = treatmentName;
        this.boosterDays = boosterDays;
        this.withdrawalDays = withdrawalDays;
        this.dosage = dosage;
        this.description = description;

    }

    public long getTreatmentId() {
        return treatmentId;
    }

    public void setTreatmentId(long treatmentId) {
        this.treatmentId = treatmentId;
    }

    public String getTreatmentName() {
        return treatmentName;
    }

    public void setTreatmentName(String treatmentName) {
        this.treatmentName = treatmentName;
    }

    public int getBoosterDays() {
        return boosterDays;
    }

    public void setBoosterDays(int boosterDays) {
        this.boosterDays = boosterDays;
    }

    public int getWithdrawalDays() {
        return withdrawalDays;
    }

    public void setWithdrawalDays(int withdrawalDays) {
        this.withdrawalDays = withdrawalDays;
    }

    public double getDosage() {
        return dosage;
    }

    public void setDosage(double dosage) {
        this.dosage = dosage;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Treatment{" +
                "treatmentId=" + treatmentId +
                ", treatmentName='" + treatmentName + '\'' +
                ", boosterDays=" + boosterDays +
                ", withdrawalDays=" + withdrawalDays +
                ", dosage=" + dosage +
                ", description='" + description + '\'' +
                '}';
    }
}
