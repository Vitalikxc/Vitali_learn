package org.example.homework_8.task1;

public class Therapist implements Doctor {
    @Override
    public void heal() {
        System.out.println("Подбирает лекарства");
    }

    public void selectionDoctor(Patient patient) {
        if (patient.getTreatmentPlan() == 1) {
            System.out.println("Хирург");
            patient.setDoctor(new Surgeon());
        } else if (patient.getTreatmentPlan() == 2) {
            System.out.println("Дантист");
            patient.setDoctor(new Dentist());
        } else {
            System.out.println("Терапевт");
            patient.setDoctor(new Therapist());
        }
        patient.getDoctor().heal();
    }
}
