package NGlesson34.classwork.SecondTastExample;

import java.util.List;
import java.util.Objects;

public class Courier {
    private String name;

    private List<Delivery> deliveryList;
    private List<Delivery> notDeliveredList;

    public Courier(String name, List<Delivery> deliveryList, List<Delivery> notDeliveredList) {
        this.name = name;
        this.deliveryList = deliveryList;
        this.notDeliveredList = notDeliveredList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Delivery> getDeliveryList() {
        return deliveryList;
    }

    public void setDeliveryList(List<Delivery> deliveryList) {
        this.deliveryList = deliveryList;
    }

    public List<Delivery> getNotDeliveredList() {
        return notDeliveredList;
    }

    public void setNotDeliveredList(List<Delivery> notDeliveredList) {
        this.notDeliveredList = notDeliveredList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Courier courier = (Courier) o;
        return Objects.equals(name, courier.name) && Objects.equals(deliveryList, courier.deliveryList) && Objects.equals(notDeliveredList, courier.notDeliveredList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, deliveryList, notDeliveredList);
    }

    @Override
    public String toString() {
        return "Courier{" +
                "name='" + name + '\'' +
                ", deliveryList=" + deliveryList +
                ", notDeliveredList=" + notDeliveredList +
                '}';
    }
}
