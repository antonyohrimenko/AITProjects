package lesson25.classwork.example01;

public class Dog extends Pet implements Voiceable, Pettable, Walkable {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void feed() {
        System.out.println("Собака покормлена!");
    }

    @Override
    public void cleanUp() {
        System.out.println("Все убрано в мешочек");
    }

    @Override
    public void voice(){
        System.out.println("ГАВгав, корми давай!");
    }

    @Override
    public void pet() {
        System.out.println("Собака поглажена!");
    }

    @Override
    public void goForAWalk() {
        System.out.println("Собака бежит и волосы назад");
    }
}
