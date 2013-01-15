package encryption;

import java.util.Scanner;



public class Enigma {

    public static void main(String[] args) {
        String line = new Scanner(System.in).nextLine();
        new Leeter().encrypt(line);
    }
}
