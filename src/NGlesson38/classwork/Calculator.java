package NGlesson38.classwork;

public class Calculator {

    public double calculate(){
        int count = 0;

        for (int i =0; i < 100; i++){
            count += i;
            if (count == 1000){
                throw new MyException();
            }
        }
        return count;
    }
}
