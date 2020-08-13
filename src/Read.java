import java.util.Scanner;

public class Read {

    Scanner scan = new Scanner(System.in);

    String input = scan.nextLine();

    public String[] getInput() {

        String[] str = input.split("\\s");

        return str;

    }


    public static void main(String[] args) {

        Read read = new Read();
        String[] s = read.getInput();
        Verifier ver = new Verifier();
        Handshake calculation = new Handshake();
        System.out.println(calculation.getResult(ver.grandCheck(s), s));

    }

}