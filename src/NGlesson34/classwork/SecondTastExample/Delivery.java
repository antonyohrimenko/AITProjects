package NGlesson34.classwork.SecondTastExample;

import java.util.Objects;

public class Delivery {

    private double weight;

    public Delivery(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Delivery delivery = (Delivery) o;
        return Double.compare(weight, delivery.weight) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight);
    }

    @Override
    public String toString() {
        return "Delivery{" +
                "weight=" + weight +
                '}';
    }
}
