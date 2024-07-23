package NGlesson39.homework.task02;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Parcel> parcels = new ArrayList<>();

        parcels.add(new Parcel("New York", "Berlin", 5.0, Instant.parse("2024-06-01T12:00:00Z")));
        parcels.add(new Parcel("Paris", "Berlin", 3.0, Instant.parse("2024-06-02T10:00:00Z")));
        parcels.add(new Parcel("Tokyo", "Moscow", 7.0, Instant.parse("2024-06-03T14:00:00Z")));
        parcels.add(new Parcel("Moscow", "Berlin", 2.0, Instant.parse("2023-06-01T15:00:00Z")));

        Parcel newestParcelToBerlin = parcels.stream()
                .filter(parcel -> "Berlin".equals(parcel.getDestinationCity()))
                .max(Comparator.comparing(Parcel::getCreationInstant))
                .orElseThrow(() -> new RuntimeException("No parcels to Berlin found"));

        System.out.println("The newest parcel to Berlin is: " + newestParcelToBerlin);
    }
}
