public class Rome {

    static String[] rome = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};



    public int convert(String[] sArr, int x) {

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
}


