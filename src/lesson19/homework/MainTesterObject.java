package lesson19.homework;

public class MainTesterObject {
    public static void main(String[] args) {

        Student student = new Student("Anton", "Okhrimenko", 35, "MSU");

        student.getInfo();

        student.passExam();
        student.passExam();

        student.getPerfomance();

        student.setUniversity("Hamburg University");
        student.getUniversity();
        student.getInfo();

        System.out.println("==================================");


        // ТЕСТИРОВАЛ НА  INK_VALUE = 10 ради удобства

        Pen pen1 = new Pen("Parker");
        pen1.checkInk();

        pen1.write("12"); // написали 2 символа
        pen1.checkInk();

        pen1.write("  A B   C D "); // написали еще 4. осталось одна чернила
        pen1.checkInk();

        pen1.write(" 1 2 3 4 5 "); // напишем с кучей пробелов

        System.out.println("==================================");

        pen1.write("something");
        pen1.refill();
        pen1.checkInk();


        System.out.println("==================================");

        pen1.write("This was a good task!");
    }
}
