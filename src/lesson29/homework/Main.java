package lesson29.homework;

public class Main {
    public static void main(String[] args) {

        // Создаем 2 гири, желтую и красную с разными весами

        Kettlebell kettle1 = new Kettlebell(5.25,Materials.PLASTIC, Colours.YELLOW);
        Kettlebell kettle2 = new Kettlebell(6.17,Materials.STEAL, Colours.RED);

        // демонтрируем работу методов equals, hashCode, toString

        System.out.println(kettle1.toString()); // toString чисто для наглядности дописал
        System.out.println(kettle2.toString());
        System.out.println(kettle1.equals(kettle2)); // ожидаю false в консоле

        // ожидаю 2 разных хешкода
        System.out.println(kettle1.hashCode());
        System.out.println(kettle2.hashCode());

        // показываем какая гиря тяжелее по весу

        System.out.println("\n ============ \n ");

        int result = kettle1.compareTo(kettle2);

        if (result > 0) {
            System.out.println("1st Kettlebell is heavier!");
        } else if (result < 0) {
            System.out.println("2nd Kettlebell is heavier!");
        } else {
            System.out.println("Kettlebells are Equal");
        }
    }
}
