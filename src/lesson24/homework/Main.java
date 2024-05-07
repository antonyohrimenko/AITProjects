package lesson24.homework;


public class Main {
    public static void main(String[] args) {

        Pen pen1 = new Pen("Parker");
        Pen pen2 = new Pen("Parker");

        System.out.println(pen1.toString());
        System.out.println(pen2.toString());

        System.out.println(pen1.equals(pen2));

        System.out.println(pen1.hashCode());
        System.out.println(pen2.hashCode());

        System.out.println("\n ============== \n");

        System.out.println(pen1.equals(pen2));
        System.out.println("Ref: " + pen1.equals(pen1));
        System.out.println("Type: " + pen1.equals("Parker"));
        System.out.println("Value: " + pen2.equals(new Pen ("Parker")));
        System.out.println(pen2.hashCode());


    }
}
