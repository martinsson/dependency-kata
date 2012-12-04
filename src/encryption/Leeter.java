package encryption;

public class Leeter {

    public Leeter() {
    }
    
    public void encrypt() {
        String line = System.console().readLine();
        String encryptedLine = line.replace("S", "5").replaceAll("T", "7") + "\n";
        System.console().printf("The encryption of %1$2s is : %2$2s", line, encryptedLine);
    }


}
