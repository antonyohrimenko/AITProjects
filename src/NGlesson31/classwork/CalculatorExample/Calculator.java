package NGlesson31.classwork.CalculatorExample;

public class Calculator <T extends Integer> {

    public T sum(T first, T second){
        int result =  Integer.sum(first,second);
        Integer integer = result;
        return (T) integer;
    }
}
