package NGlesson24.homework.Task02;


public class Calculator {

public double calculateExpression(String input) {

    // Приводим строку в цельный вид без пробелов
    input = input.replaceAll(" ", "");

    // Ищем индекс оператора
    int operatorIndex = findOperatorIndex(input);

    // Если оператор не найден, выбрасываем исключение
    if (operatorIndex == -1) {
        throw new IllegalArgumentException("Неверный формат ввода. Ожидается формат: число знак число");
    }

    // Спарсим два числа по обеим сторонам от оператора
    double num1 = Double.parseDouble(input.substring(0, operatorIndex));
    double num2 = Double.parseDouble(input.substring(operatorIndex + 1));
    Operator operator = Operator.fromString(input.substring(operatorIndex, operatorIndex + 1));

    // Вычислим результат операции
    return operator.apply(num1, num2);
}

private int findOperatorIndex(String input) {
    for (int i = 0; i < input.length(); i++) {
        if (Operator.isOperator(input.charAt(i))) {
            return i;
        }
    }
    return -1;
}
}

