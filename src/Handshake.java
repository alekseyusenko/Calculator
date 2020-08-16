public class Handshake {
    Rome rome = new Rome();
    Calculator calc = new Calculator();


    public String getResult(String type, String[] input) {
        int a, b;
        String result;
        int outcome = 0;
        if (type.equals("rome")) {
            a = rome.romanToIntConverter(input, 0);
            b = rome.romanToIntConverter(input, 2);
            outcome = calc.getResult(a, b, input);
            result = rome.intToRomeConverter(outcome);

            return result;

        } else if (type.equals("int")) {
            a = Integer.parseInt(input[0]);
            b = Integer.parseInt(input[2]);
            outcome = calc.getResult(a, b, input);
            result = String.valueOf(outcome);
            return result;
        } else System.exit(0); // СЛОЖНЫЙ МОМЕНТ. Это нормально, так дропать программы? Наверное, нет.
            return "Вы не должны это видеть.";



    }
}
