package lesson25.classwork.example01;

public class Cat extends Pet implements Voiceable, Pettable {
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void feed() {
        System.out.println("Вы положите еду в тарелку коту");
    }

    @Override
    public void cleanUp() {
        System.out.println("Встал быстро и убрал за мной. Я КОТ!");
    }

    @Override
    public void voice(){
        System.out.println("Meow-Meow, корми давай!");
    }

    @Override
    public void pet() {
        System.out.println("Гладь меня раб, я кот!");
    }
}
