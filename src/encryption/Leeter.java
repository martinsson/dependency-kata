package encryption;


public class Leeter {

    
    public Leeter() {
    }
    
    /**
     * Test as much of the algorithm as possible
     * Do minimal refactorings if needed
     * @param line TODO
     */
    public void encrypt(String line) {
        String encryptedLine = line.replaceAll("e", "3") + "\n";
        System.console().printf("The encryption of %1$2s is : %2$2s", line, encryptedLine );
    }
    
}