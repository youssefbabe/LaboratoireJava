package labwork7;

public class Operations extends Calculator implements Comparable<Operations> {

    public double add() throws InvalidOperationException {
        if (Double.isNaN(param1) || Double.isNaN(param2)) {
            throw new InvalidOperationException("Invalid input for addition.");
        }
        result = param1 + param2;
        return result;
    }

    public double subtract() throws InvalidOperationException {
        if (Double.isNaN(param1) || Double.isNaN(param2)) {
            throw new InvalidOperationException("Invalid input for subtraction.");
        }
        result = param1 - param2;
        return result;
    }

    public double multiply() throws InvalidOperationException {
        if (Double.isNaN(param1) || Double.isNaN(param2)) {
            throw new InvalidOperationException("Invalid input for multiplication.");
        }
        result = param1 * param2;
        return result;
    }

    public double divide() throws InvalidOperationException {
        if (Double.isNaN(param1) || Double.isNaN(param2)) {
            throw new InvalidOperationException("Invalid input for division.");
        }
        if (param2 != 0) {
            result = param1 / param2;
        } else {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return result;
    }

    public double modulus() throws InvalidOperationException {
        if (Double.isNaN(param1) || Double.isNaN(param2)) {
            throw new InvalidOperationException("Invalid input for modulus.");
        }
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

    @Override
    public int compareTo(Operations o) {
        return Double.compare(this.result, o.result);
    }
}