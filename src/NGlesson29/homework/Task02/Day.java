package NGlesson29.homework.Task02;

public enum Day {
    MONDAY("Workday"),
    TUESDAY("Workday"),
    WEDNESDAY("Workday"),
    THURTHDAY("Workday"),
    FRIDAY("Workday"),
    SATURDAY("Day off"),
    SUNDAY("Day off");

    private final String type;

    Day(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
