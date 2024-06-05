package NGlesson26.classwork.example;

public class Car {

    private String name;
    private String age;
    private CarType carType;

    public Car(String name, String age, CarType carType) {
        this.name = name;
        this.age = age;
        this.carType = carType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", carType=" + carType +
                '}';
    }
}
