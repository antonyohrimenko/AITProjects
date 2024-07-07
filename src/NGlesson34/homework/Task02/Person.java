package NGlesson34.homework.Task02;

import java.util.Objects;

public class Person {

    private String name;
    private Person father;
    private Person mother;

    public Person(String name, Person father, Person mother) {
        this.name = name;
        this.father = father;
        this.mother = mother;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person getFather() {
        return father;
    }

    public void setFather(Person father) {
        this.father = father;
    }

    public Person getMother() {
        return mother;
    }

    public void setMother(Person mother) {
        this.mother = mother;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(father, person.father) && Objects.equals(mother, person.mother);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, father, mother);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", father=" + father +
                ", mother=" + mother +
                '}';
    }
}
