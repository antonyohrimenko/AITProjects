package lesson20.classwork;

public enum TrafficLightColor {

    RED("Red",false),
    WHITE("white", false),
    YELLOW("Yellow",false),
    GREEN("Green",true);





    private String color_name;
    private boolean can_go;

    // ниже конструкторы и ассесоры

    TrafficLightColor(String color_name, boolean can_go) {
        this.color_name = color_name;
        this.can_go = can_go;
    }

    public String getColor_name() {
        return color_name;
    }

    public void setColor_name(String color_name) {
        this.color_name = color_name;
    }

    public boolean isCan_go() {
        return can_go;
    }

    public void setCan_go(boolean can_go) {
        this.can_go = can_go;
    }
}
