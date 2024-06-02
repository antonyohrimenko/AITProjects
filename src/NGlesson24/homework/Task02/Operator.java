package NGlesson24.homework.Task02;


enum Operator {
    ADD("+") {
        @Override
        public double apply(double a, double b) {
            return a + b;
        }
    },
    SUBTRACT("-") {
        @Override
        public double apply(double a, double b) {
            return a - b;
        }
    },
    MULTIPLY("*") {
        @Override
        public double apply(double a, double b) {
            return a * b;
        }
    },
    DIVIDE("/") {
        @Override
        public double apply(double a, double b) {
            if (b == 0) {
                throw new ArithmeticException("Деление на ноль невозможно");
            }
            return a / b;
        }
    };

    private final String symbol;

    // конструктор
    Operator(String symbol) {
        this.symbol = symbol;
    }

    // абстрактный метод для его переопределения
    public abstract double apply(double a, double b);

    public static Operator fromString(String symbol) {
        for (Operator operator : Operator.values()) {
            if (operator.symbol.equals(symbol)) {
                return operator;
            }
        }
        throw new IllegalArgumentException("Неверный оператор. Допустимые операторы: +, -, *, /");
    }

    public static boolean isOperator(char c) {
        for (Operator operator : Operator.values()) {
            if (operator.symbol.charAt(0) == c) {
                return true;
            }
        }
        return false;
    }
}