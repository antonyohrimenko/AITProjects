package lesson22.homework.Task02;

public enum SolarSystemPlanet {
    MERCURY("Меркурий", 2439.7, 3.285e23),
    VENUS("Венера", 6051.8, 4.867e24),
    EARTH("Земля", 6371, 5.972e24),
    MARS("Марс", 3389.5, 6.39e23),
    JUPITER("Юпитер", 69911, 1.898e27),
    SATURN("Сатурн", 58232, 5.683e26),
    URANUS("Уран", 25362, 8.681e25),
    NEPTUNE("Нептун", 24622, 1.024e26);

    private final String name;
    private final double radius; // радиус планеты в км
    private final double mass;   // масса в кг

    SolarSystemPlanet(String name, double radius, double mass) {
        this.name = name;
        this.radius = radius;
        this.mass = mass;
    }

    public String getName() {
        return name;
    }

    public double getRadius() {
        return radius;
    }

    public double getMass() {
        return mass;
    }

    // вычисляем гравитацию
    public double calculateGravity() {
        final double G = 6.6743e-11;
        return G * mass / Math.pow(radius * 1000, 2); // Преобразуем радиус в метры
    }
}
