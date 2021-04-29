public class Calculator {
    public int adding(int num1, int num2) {
        int result;
        result = num1 + num2;
        return result;

    }

    public int subtraction(int num1, int num2) {
        int result;
        result = num1 - num2;
        return result;

    }

    public int multiplication(int num1, int num2) {
        int result;
        result = num1 * num2;
        return result;

    }

    public int division(int num1, int num2) {
        int result;
        if (num2 == 0) {
            num2 = 1;
        }
        result = num1 / num2;

        return result;

    }
}
