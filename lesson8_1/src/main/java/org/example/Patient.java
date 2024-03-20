package org.example;

public class Patient {

    private int medrule;
    private Doctor doctor;

    public Patient(int medrule) {
        this.medrule = medrule;
    }

    public int getMedrule() {
        return medrule;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Doctor getDoctor() {
        return doctor;
    }
}
