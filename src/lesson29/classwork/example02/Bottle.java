package lesson29.classwork.example02;

public class Bottle implements Comparable <Bottle> {

    private Materials material;
    private double litters;

    public Bottle(Materials material, double litters) {
        this.material = material;
        this.litters = litters;
    }

    public Materials getMaterial() {
        return material;
    }

    public double getLitters() {
        return litters;
    }

    @Override
    public int compareTo(Bottle o) {
        if (this.litters > o.litters){
            return 1;
        } else if (this.litters < o.litters) {
            return -1;
        }
        return 0;
    }
}
