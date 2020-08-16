public class Rome {

    static String[] rome = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};



    public int romanToIntConverter(String[] sArr, int x) {

        int num = 0;

        for (int i = 0; i < rome.length; i++) {

            if (sArr[x].equals(rome[i])) {
                num = i + 1;
            }
        }
        return num;
    }

    public boolean isRoman(String str) {

        boolean result = true;

        for (String value : rome) {

            if (str.equals(value)) {
                result = true;
                break;
            }
            else result = false;
        }
        return result;
    }

    private StringBuilder intUnitsToRome (int units) {
        StringBuilder unitsResult = new StringBuilder();
        if (units > 0) {

            if (units <= 3) {
                for (int j = 0; j < units; j++)
                    unitsResult.append("I");
            } else if (units == 4) {
                unitsResult.append("IV");
            } else if ((units > 4) & (units < 9)) {
                unitsResult.append("V");
                for (int j = 0; j < units - 5; j++)
                    unitsResult.append("I");
            } else if (units == 9) unitsResult.append("IX");
        }

        else if (units < 0) {
            unitsResult.append("Скорее всего, римляне не использовали отрицательные числа. Но если бы использовали, результат ваших вычислений был бы таким: ");
            unitsResult.append("-");

            if (units >= -3) {
                for (int j = 0; j > units; j--)
                    unitsResult.append("I");
            } else if (units == -4) {
                unitsResult.append("IV");
            } else if ((units < -4) & (units > -9)) {
                unitsResult.append("V");
                for (int j = 0; j > units + 5; j--)
                    unitsResult.append("I");
            } else unitsResult.append("IX");
        }


            return unitsResult;

    }

    public String intToRomeConverter(int calcResult) {

        StringBuilder romeResult = new StringBuilder();
        if ((calcResult < 10)) romeResult.append(intUnitsToRome(calcResult));

        else if ( (calcResult / 10 != 0) & (calcResult < 100) ) {
            int dozens = calcResult / 10;
            int units = calcResult % 10;

            if (dozens <= 3) {
                for (int j = 0; j < dozens; j++)
                    romeResult.append("X");
            } else if (dozens == 4) {
                romeResult.append("XL");
            } else if ((dozens > 4) & (dozens < 9)) {
                romeResult.append("L");
                for (int j = 0; j < dozens - 5; j++)
                    romeResult.append("X");
            } else if (dozens == 9) romeResult.append("XC");

            romeResult.append(intUnitsToRome(units));

        }
        else if (calcResult == 100) romeResult.append("C");

        else if (calcResult == 0) romeResult.append("N");



        return romeResult.toString();
    }
}


