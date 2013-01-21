    package encryption;

import java.io.Console;

public class Leeter {

    public Leeter() {
    }
    
    public void encrypt() {
        Console console = System.console();
        encrypt(new Myconsole(console));
    }

    public static class Myconsole {
        private Console console;

        public Myconsole(Console console2) {
            console = console2;
        }

        public Console printf(String format, Object... args) {
            return console.printf(format, args);
        }

        public char[] readPassword() {
            return console.readPassword();
        }
    }
    
    public void encrypt(Myconsole myconsole) {
        char[] line = myconsole.readPassword();
        char[] encryptedLine = new char[line.length];
        for (int i = 0; i < line.length; i++) {
            char c = line[i];
            int j = c+1;
            encryptedLine[i] = (char)j;
        }
        myconsole.printf("The encryption of %1$2s is : %2$2s\n", String.valueOf(line).replaceAll(".", "*"), String.valueOf(encryptedLine));
    }


}
