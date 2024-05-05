package lesson23.classwork.example02;

public class Human {
    private String fullName;
    private String address;
    private int age;

    public Human(String fullName, String address, int age) {
        this.fullName = fullName;
        this.address = address;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
