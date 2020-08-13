class Verifier {

    private static boolean intCheck(String str) {

        try {
            int i = Integer.parseInt(str);

        } catch (NumberFormatException nfe) {
            return false;
        }


        return true;
    }

    public static boolean isOperator(String str) {
        char[] operators = {'+', '-', '*', '/', ':'};
        char ch = str.charAt(0);
        boolean result = true;
        for (char check: operators) {
            if (ch == check) {
                result = true;
                break;
            }
           else result = false;
            }
        return result;
        }




    public String grandCheck(String[] inputArr) {
        String result;
        Rome rome = new Rome();
        int a, b;

        try {
            if (inputArr.length != 3) {
                throw new Exception("Для нормальной работы программы нужно ввести два операнда и один оператор. Попробуйте ещё раз.");
            }
            if (!isOperator(inputArr[1])) throw new Exception("Введён неправильный оператор. Попробуйте ещё раз.");

            if (intCheck(inputArr[0]) & intCheck(inputArr[2])) {
                a = Integer.parseInt(inputArr[0]);
                b = Integer.parseInt(inputArr[2]);
                if ((a > 10 || a < 1) || (b > 10 || b < 1)) {
                    throw new Exception("Калькулятор принимает на вход числа от 1 до 10 включительно, не более. Попробуйте ещё раз.");
                }
                return "int";
            } else {
                try {
                    if (rome.isRoman(inputArr[0]) & rome.isRoman(inputArr[2])) return "rome";
                    if ((intCheck(inputArr[0]) & rome.isRoman(inputArr[2])) || (rome.isRoman(inputArr[0]) & intCheck(inputArr[2]))) {
                        throw new Exception("Калькулятор умеет работать только с арабскими или римскими цифрами одновременно. Попробуйте ещё раз.");
                    }
                    else System.out.println("Калькулятор умеет работать только с целыми числами от 1 до 10. Попробуйте ещё раз.");
                }
                catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
            }
        } catch (Exception exc) {
            System.out.println(exc.getMessage());
        }
        return "error";
    }
}





