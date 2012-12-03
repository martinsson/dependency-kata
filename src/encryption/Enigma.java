package encryption;


public class Enigma {

    /**
     * @param args
     */
    public static void main(String[] args) {
        encrypt();
    }

    private static void encrypt() {
        String line = System.console().readLine();
        System.console().printf("%1$2s", line.replaceAll("e", "3") + "\n");
    }

}
