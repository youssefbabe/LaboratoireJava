package labwork5;

public class Operations extends Calculator {

    public double add() {
        result = param1 + param2;
        return result;
    }

    public double subtract() {
        result = param1 - param2;
        return result;
    }

    public double multiply() {
        result = param1 * param2;
        return result;
    }

    public double divide() {
        if (param2 != 0) {
            result = param1 / param2;
        } else {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return result;
    }

    public double modulus() {
        if (param2 != 0) {
            result = param1 % param2;
        } else {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return result;
    }

    @Override
    public double calculate() {
        // Default implementation, can be overridden
        return result;
    }

    @Override
    public String toString() {
        return "Operations{" +
                "result=" + result +
                ", param1=" + param1 +
                ", param2=" + param2 +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Operations that = (Operations) obj;
        return Double.compare(that.result, result) == 0 &&
                Double.compare(that.param1, param1) == 0 &&
                Double.compare(that.param2, param2) == 0;
    }
}