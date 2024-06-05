package NGlesson26.classwork.example;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("Audi", "28", CarType.AUTOMATIC);
        car.setCarType(CarType.MECHANIC);
        System.out.println(car.toString());
    }
}
