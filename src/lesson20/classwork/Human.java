package lesson20.classwork;

public class Human {

    public static String species = "Homo Sapience";
    private String name;
    private int age;

    public static String getSpecies() {
        return species;
    }

    public static void setSpecies(String species) {
        Human.species = species;
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

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
