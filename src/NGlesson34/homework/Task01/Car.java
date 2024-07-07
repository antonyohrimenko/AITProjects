package NGlesson34.homework.Task01;

import java.util.Objects;

public class Car {

    private String make;
    private int manufactureDate;
    private int mileage;

    public Car(String make, int manufactureDate, int mileage) {
        this.make = make;
        this.manufactureDate = manufactureDate;
        this.mileage = mileage;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(int manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return manufactureDate == car.manufactureDate && mileage == car.mileage && Objects.equals(make, car.make);
    }

    @Override
    public int hashCode() {
        return Objects.hash(make, manufactureDate, mileage);
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", manufactureDate=" + manufactureDate +
                ", mileage=" + mileage +
                '}';
    }
}
