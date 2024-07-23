package NGlesson39.homework.task02;

import java.time.Instant;

/*
2. Создайте класс "посылка".
2.1 Добавьте поля: город отправления и город получения, вес посылки, дата-время создания посылки
 (посылки могут создаваться по всему миру, очень много часовых поясов, нам важна не конкретная дата,
а лишь какая посылка была создана ранее, чем другая)
2.2 Создать несколько посылок
2.3 Найти самую новую посылку среди тех, кто отправляется в Берлин

 */
public class Parcel {

    private String originCity;
    private String destinationCity;
    private double weight;
    private Instant creationInstant;

    public Parcel(String originCity, String destinationCity, double weight, Instant creationInstant) {
        this.originCity = originCity;
        this.destinationCity = destinationCity;
        this.weight = weight;
        this.creationInstant = creationInstant;
    }

    public String getOriginCity() {
        return originCity;
    }

    public String getDestinationCity() {
        return destinationCity;
    }

    public double getWeight() {
        return weight;
    }

    public Instant getCreationInstant() {
        return creationInstant;
    }

    @Override
    public String toString() {
        return "Parcel{" +
                "originCity='" + originCity + '\'' +
                ", destinationCity='" + destinationCity + '\'' +
                ", weight=" + weight +
                ", creationInstant=" + creationInstant +
                '}';
    }
}
