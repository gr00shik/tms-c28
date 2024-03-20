package org.example;

public class Terapeft extends Doctor {

    private Doctor[] doctors = new Doctor[2];

    public Terapeft(Doctor ... doctors) {
        this.doctors = doctors;
    }

    @Override
    public void heal() {
        System.out.println("pemerili davlenie");
    }

    public void setDoctor(Patient patient) {
        int medrule = patient.getMedrule();
        if (medrule == 0) {
            for (var doctor: doctors) {
                if (doctor.type().equals("xuryrg")) {
                    patient.setDoctor(doctor);
                }
            }
        } else if (medrule == 1) {
            for (var doctor: doctors) {
                if (doctor.type().equals("dantist")) {
                    patient.setDoctor(doctor);
                }
            }
        } else {
            patient.setDoctor(this);
        }

    }

    @Override
    public String type() {
        return "terapeft";
    }
}
