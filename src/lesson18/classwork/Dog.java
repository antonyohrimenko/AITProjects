package lesson18.classwork;

public class Dog {
    String name;
    int weight;

    public Dog (String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    String whoAmI (){
        return "I am dog " + this.name + " my weight " + this.weight;
    }

    void eat(){
        System.out.println("Я кушаю, ням-ням");
        weight++;
    }

    void run(){

        while (weight < 3 ) {
            System.out.println("Сорян, я голодная и худая, бежать не могу");
            System.out.println("Надо поесть. Мой вес сейчас " + weight);

            eat();
        }

            System.out.println("я бегууууууу! и худею!"); // двигать строку по коду Option + Shift + вверх
            // command + D - дублирует строку текущую
            weight -= 2; // w = w - 2

    }


}
