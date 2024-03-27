package org.example;

public class Main {
    public static void main(String[] args) {

        Doctor xuryrg = new Xuryrg();
        Doctor dantist = new Dantist();
        Terapeft therapeft = new Terapeft(xuryrg, dantist);

        Patient patient = new Patient(3434);

        therapeft.setDoctor(patient);

        Doctor doctor = patient.getDoctor();
        doctor.heal();


    }
}