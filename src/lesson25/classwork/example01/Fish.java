package lesson25.classwork.example01;

public class Fish extends Pet implements Pettable {
    public Fish(String name, int age) {
        super(name, age);
    }

    @Override
    public void feed() {
        System.out.println("Чуть-чуть корма добавим в аквариум");
    }

    @Override
    public void cleanUp() {
        System.out.println("какуны убраны сэр");
    }

    @Override
    public void pet() {
        System.out.println("Вы погладили без уважения");
    }
}
