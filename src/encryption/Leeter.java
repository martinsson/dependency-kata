package encryption;

public class Leeter {

    public Leeter() {
    }
    
    public void encrypt() {
        char[] line = System.console().readPassword();
        char[] encryptedLine = new char[line.length];
        for (int i = 0; i < line.length; i++) {
            char c = line[i];
            int j = c+1;
            encryptedLine[i] = (char)j;
        }
        System.console().printf("The encryption of %1$2s is : %2$2s\n", String.valueOf(line).replaceAll(".", "*"), String.valueOf(encryptedLine));
    }


}
