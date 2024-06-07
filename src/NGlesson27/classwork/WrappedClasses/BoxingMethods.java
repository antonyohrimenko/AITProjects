package NGlesson27.classwork.WrappedClasses;

import java.util.Scanner;

public class BoxingMethods {
    public static void main(String[] args)
    {


        // Если бы не было классов оболочек, мы бы не могли класть в него числа и другие типы
        Object [] arrayObjects = new Object[5];
        arrayObjects[0] = "123";
        arrayObjects[1] = new Scanner(System.in);
        arrayObjects[2] = new Exception();
        arrayObjects[3] = 4;

    }
}
