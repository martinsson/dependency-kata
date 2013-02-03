package encryption;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Test;

import encryption.Leeter.Myconsole;

public class EnigmaTest {
    Leeter leeter = new Leeter();
    Myconsole console = mock(Myconsole.class);

    @Test public void 
    it_replaces_each_character_with_its_successor() throws Exception {
        givenTheUserEnters("secret");
        leeter.encrypt(console);
        verifyItReplaces("tfdsfu", "******");
    }

    @Test public void 
    it_does_noting_to_empty_string() throws Exception {
        givenTheUserEnters("");
        leeter.encrypt(console);
        verifyItReplaces("", "");
    }

    private void givenTheUserEnters(String string) {
        when(console.readPassword()).thenReturn(string.toCharArray());
    }

    private void verifyItReplaces(String string, String string2) {
        verify(console).printf("The encryption of %1$2s is : %2$2s\n", string2, string);
    }
    
}
