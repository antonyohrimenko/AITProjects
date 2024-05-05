package lesson23.classwork.example01;

public class Pet {

    protected String name;
    protected int age;
    protected String breed;
    protected double weight;

    public Pet(String name, int age, String breed, double weight) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.weight = weight;
    }


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

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


}
