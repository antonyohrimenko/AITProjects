package NGlesson38.homework.Exceptions;

// непроверяемое исключением, наследуемся от непроверяемого родителя
public class UncheckedCustomException extends RuntimeException {

    public UncheckedCustomException (String message){
        super(message);
    }

}
