package NGlesson31.classwork.CalculatorExample;

public class Printer <T extends Number> {

    public void print(T value){

        System.out.println(value.longValue());

    }
}
