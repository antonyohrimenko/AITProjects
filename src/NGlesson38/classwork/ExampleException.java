package NGlesson38.classwork;

public class ExampleException {

    public static void main(String[] args) {
        method();
    }

    public static void method(){
        throw new MyException();
    }
}
