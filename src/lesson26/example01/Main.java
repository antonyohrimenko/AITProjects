package lesson26.example01;

public class Main {
    public static void main(String[] args) {
        Item item = new Item("IPhone 15 Pro Max", 1599);
        item.getProperties().setColor("Black");
        item.getProperties().setDateOfManufacture("2024-02-15");


        /* ====  Дизайн патернс =====

        Item item = new Item("IPhone 15 Pro Max", 1599,
            Item.Properties.empty()
                .ofColor("Black")
                .ofDateOfManufacture("2024-02-15")
        )
         */
    }
}

