package encryption;

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
        String line = new Scanner(System.in).nextLine();
        System.out.println("You entered " + line.replaceAll("e", "3") + "\n");
    }

}
