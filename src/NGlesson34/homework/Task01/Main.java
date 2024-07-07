package NGlesson34.homework.Task01;

/*
1.1 Создайте класс "Машина"
1.2 Добавьте в этот класс 3 поля: наименование марки, год выпуска и пробег

2.1. Среди машин, которые имеют год выпуска новее, чем 1999, необходимо подсчитать общий пробег
2.2. Среди машин, у которых пробег более 500 000, найти самую старую машину
2.3. Среди машин, у которых марка начинается на "V" или "W", найти с самым большим пробегом, но не более 200 000 тысяч
 */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        // создадим простенькие машины и добавим руками в список
        List<Car> list = new ArrayList<>();

        list.add(new Car("Wolga", 1970, 600_000));
        list.add(new Car("Volkswagen", 1980, 550_000));
        list.add(new Car("Mercedes", 2010, 100_000));
        list.add(new Car("Volvo", 2011, 190_000));
        list.add(new Car("BMW", 2024, 30_000));
        list.add(new Car("Toyota", 2015, 50_000));
        list.add(new Car("WueWue China", 2023, 180_000));

        // 2.1. Среди машин, которые имеют год выпуска новее, чем 1999, необходимо подсчитать общий пробег

        int totalMiles = list.stream()
                .filter(car -> car.getManufactureDate() > 1999)
                .mapToInt(Car::getMileage)
                .sum();
        System.out.println("Общий пробег машин новее 1999 года: " + totalMiles);

        // 2.2. Среди машин, у которых пробег более 500 000, найти самую старую машину

        Optional <Car> oldestCar = list.stream()
                .filter(car -> car.getMileage() > 500_000)
                .min(Comparator.comparingInt(Car::getManufactureDate));

        if (oldestCar.isPresent()) {
            System.out.println("Самая старая машина с пробегом более 500 000: " + oldestCar.get().getMake() + " с пробегом: " + oldestCar.get().getMileage());
        } else {
            System.out.println("Машин с пробегом более 500 000 не найдено.");
        }

        // 2.3. Среди машин, у которых марка начинается на "V" или "W", найти с самым большим пробегом, но не более 200 000 тысяч

        Optional<Car> carWithHighestMileage = list.stream()
                .filter(car -> (car.getMake().startsWith("V") || car.getMake().startsWith("W")) && car.getMileage() <= 200_000)
                .max(Comparator.comparingInt(Car::getMileage));

        if (carWithHighestMileage.isPresent()) {
            System.out.println("Машина с самым большим пробегом, но не более 200 000, среди машин на \"V\" или \"W\": " + carWithHighestMileage.get().getMake());
        } else {
            System.out.println("Машин с маркой, начинающейся на \"V\" или \"W\", и пробегом не более 200 000 не найдено.");
        }

    }
}
