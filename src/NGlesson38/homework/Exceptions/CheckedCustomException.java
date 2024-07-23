package NGlesson38.homework.Exceptions;

// проверяемое исключение, наследуемся от проверяемого родителя
public class CheckedCustomException extends Exception {
    public CheckedCustomException(String message) {
        super(message);
    }
}
