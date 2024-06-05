package NGlesson26.homework;

public class AccessFilter implements Filter {
    @Override
    public boolean isAllowed(String url, UserType userType) {

        if (userType == UserType.ADMIN) {
            return true;
        } else if (userType == UserType.USER) {
            return url.startsWith("http://web-for-user");
        }
        return false;
    }
}
