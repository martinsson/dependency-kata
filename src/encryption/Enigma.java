package encryption;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;


public class Enigma {

    public static void main(String[] args) {
        encrypt();
    }

    /**
     * Test as much of the algorithm as possible
     * Do minimal refactorings if needed
     */
    private static void encrypt() {
        InputStream in = System.in;
        PrintStream out = System.out;
        encrypt(in, out);
    }

    protected static void encrypt(InputStream in, PrintStream out) {
        String line = new Scanner(in).nextLine();
        out.println(encrypt(line));
    }

    protected static String encrypt(String line) {
        return "You entered " + line.replaceAll("e", "3") + "\n";
    }

}
