package org.example.homework_8;

import org.example.homework_8.task1.Patient;
import org.example.homework_8.task1.Therapist;
import org.example.homework_8.task2.Apple;

public class Main {

    private static final Patient patient = new Patient();
    private static final Therapist therapist = new Therapist();
    private static final Apple apple = new Apple();

    public static void main(String[] args) {
        runHospital();
        runChangedColor();
    }

    private static void runHospital(){
        patient.setTreatmentPlan(1);
        therapist.selectionDoctor(patient);
        patient.setTreatmentPlan(2);
        therapist.selectionDoctor(patient);
        patient.setTreatmentPlan(3);
        therapist.selectionDoctor(patient);
    }

    private static void runChangedColor(){
        System.out.println(apple.assignColor());
    }
}
