package encryption;

import static org.mockito.Mockito.mock;

import org.junit.Test;

import encryption.Leeter.Myconsole;

public class EnigmaTest {

    @Test public void 
    testname() throws Exception {
         Leeter leeter = new Leeter();
         leeter.encrypt(mock(Myconsole.class));
         
    }

}
