package lesson20.classwork;

import javax.sound.midi.Soundbank;

public class Main {
    public static void main(String[] args) {

        Human mihail = new Human("Mihail", 28);
        Human olga = new Human ("Olga", 27);

        System.out.println(mihail.getName());
        System.out.println(olga.getName());

        System.out.println("Species: " + Human.getSpecies());
        Human.species = "Domestic Cat";
        System.out.println(Human.getSpecies());


        System.out.println("=====================================");

        System.out.println(TrafficLightColor.GREEN.getColor_name());

        System.out.println("=====================================");



    }

}
