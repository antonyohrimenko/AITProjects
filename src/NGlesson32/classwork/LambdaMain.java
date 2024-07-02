package NGlesson32.classwork;

public class LambdaMain {
    public static void main(String[] args) {

        Button button = new Button() {
            @Override
            public void onClick() {
                System.out.println("Кнопочка");
            }
        };

        // можно записать лямбдой как

        Button secondButton = () -> System.out.println("Вторая кнопочка");

    }

    public static int method(int t){
        return t / 5;
    }

    // данный метод можно заменить на лямбду выражение
   // (t) -> t/5;

}
