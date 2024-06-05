package NGlesson26.homework;

public class Person {

    private String name;
    private int age;
    private UserType userType;

    public Person(String name, int age, UserType userType) {
        this.name = name;
        this.age = age;
        this.userType = userType;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public UserType getUserType() {
        return userType;
    }

    @Override
    public String toString() {
        return "Person {" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", userType=" + userType +
                '}';
    }
}
