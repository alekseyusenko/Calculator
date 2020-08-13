public class Handshake {
    Rome rome = new Rome();
    char operator;
    int a, b;
    int result;

    public int getResult(String type, String[] input) {
        if (type.equals("rome")) {
            a = rome.convert(input, 0);
            b = rome.convert(input, 2);
        }
        else if (type.equals("int")) {
            a = Integer.parseInt(input[0]);
            b = Integer.parseInt(input[2]);
        }
        else System.exit(0); // СЛОЖНЫЙ МОМЕНТ. Это нормально, так дропать программы? Наверное, нет.


        operator = input[1].charAt(0);

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
