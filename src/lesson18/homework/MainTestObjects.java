package lesson18.homework;

import java.util.Random;

public class MainTestObjects {
    public static void main(String[] args) {

        Student student = new Student("Anton", "Okhrimenko", 35, "MSU");

        student.whoAmI();
        student.passExam();
        student.getPerfomance();
        student.passExam();
        student.passExam();
        student.passExam();
        student.getPerfomance();

        System.out.println("================================================");

        Car car1 = new Car("BMW", "X3", 2020, 40000);
        car1.getInfo();
        car1.checkFuel();

        car1.drive();
        car1.drive();
        car1.drive();

        car1.refuel();
        car1.checkFuel();

        car1.drive();
        car1.drive();
        car1.drive();

        System.out.println("================================================");

        Doctor doc = new Doctor("Gregory", "House", "Therapist", "+49 152 ...");
        doc.getInfo();

        doc.chekUp();
        doc.getAnamnesis();
        doc.notAvalible();

    }
}
