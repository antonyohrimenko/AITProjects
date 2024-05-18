package lesson29.classwork.example02;

import java.util.Comparator;

public class BottleMaterialComparator implements Comparator<Bottle> {


    @Override
    public int compare(Bottle o1, Bottle o2) {
        if (o1.getMaterial().getStrength() > o2.getMaterial().getStrength()){
            return 1;
        }
        else if (o1.getMaterial().getStrength() < o2.getMaterial().getStrength()){
            return -1;
        }
            return 0;
    }
}
