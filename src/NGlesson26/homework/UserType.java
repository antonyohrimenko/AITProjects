package NGlesson26.homework;

public enum UserType {

    USER ("Пользователь"),
    ADMIN ("Администратор");

    private final String roleName;

    UserType(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleName() {
        return roleName;
    }
}
