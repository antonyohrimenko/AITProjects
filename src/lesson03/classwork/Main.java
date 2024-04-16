package lesson03.classwork;

public class Main {

    public static void main(String[] args) {
        System.out.println("Moin!\n");

       // short sNumber = (short)0b1110_1000_1100_1101;
        // переполнение типа данных (преобразование с потерей)
        short sNumber = -5939;
        byte number = (byte)sNumber;

        System.out.println(sNumber);
        System.out.println(number);

    }
}
