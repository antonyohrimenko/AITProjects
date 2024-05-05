package lesson23.classwork.example01;

public class Cat extends Pet {

private boolean hasFur;



    // Конструктор родительского класса (супер конструктор)
    public Cat(String name, int age, String breed, double weight, boolean hasFur) {
        super(name, age, breed, weight); // super вместо this если нужно обратиться
        // к родительскому классу в рамках обьекта
        this.hasFur = hasFur;
    }

    public void meow(){
        System.out.println("Мяу-мяу-мяу");
    }

    public boolean isHasFur() {
        return hasFur;
    }

    public void setHasFur(boolean hasFur) {
        this.hasFur = hasFur;
    }
}
