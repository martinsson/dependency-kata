package encryption;


public class Enigma {

    public Enigma() {
    }
    
    public void encrypt() {
        char[] line = System.console().readPassword();
        char[] encryptedLine = shift(line);
        System.console().printf("The encryption of %1$2s is : %2$2s\n", String.valueOf(line).replaceAll(".", "*"), String.valueOf(encryptedLine));
    }

    private char[] shift(char[] line) {
        char[] encryptedLine = new char[line.length];
        int wheelOffsetPosition = (int) (System.nanoTime() % 28);
        for (int i = 0; i < line.length; i++) {
            char c = line[i];
            int j = c + wheelOffsetPosition;
            encryptedLine[i] = (char)j;
        }
        return encryptedLine;
    }


}
