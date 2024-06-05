package NGlesson26.homework;

public interface Filter {
    boolean isAllowed(String url, UserType userType);
}
