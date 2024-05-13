package lesson25.homework;

class RegularPolygon extends Shape {
    private int sides; // кол-во сторон
    private double sideLength;

    public RegularPolygon(int sides, double sideLength) {
        this.sides = sides;
        this.sideLength = sideLength;
    }

    @Override
    double getPerimeter() {
        return sides * sideLength;
    }
}
