public class Calculator {
   private int result = 0;

    public int getResult(int a, int b, String[] input) {
        char operator = input[1].charAt(0);

        switch (operator) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
            case ':':
                result = a / b;
                break;
        }
        return result;
    }
}
