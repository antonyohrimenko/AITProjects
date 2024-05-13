package lesson25.classwork.example01;

public abstract class Pet {

   private String name;
   private int age;

    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // определили абстрактный метод войс
    public abstract void feed();
    public abstract void cleanUp();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
