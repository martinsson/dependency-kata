package encryption;

import java.util.Scanner;


public class Enigma {

    /**
     * @param args
     */
    public static void main(String[] args) {
        encrypt();
    }

    private static void encrypt() {
        String line = new Scanner(System.in).nextLine();
        System.out.println("You entered " + line.replaceAll("e", "3") + "\n");
    }

}
