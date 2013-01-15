package encryption;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.Test;

public class EnigmaTest {

    @Test public void 
    it_replqces_e_by_3s() throws Exception {
         assertEquals("You entered Bonjour monsi3ur\n", Enigma.encrypt("Bonjour monsieur"));
    }
    
    @Test public void 
    it_does_it_by_reading_stdin_and_writing_to_stdout() throws Exception {
        InputStream inputStream = new ByteArrayInputStream("vive la france".getBytes());
        PrintStream writer = mock(PrintStream.class);
        
        Enigma.encrypt(inputStream, writer);
        verify(writer).println("You entered viv3 la franc3\n");
    }
    
    

}
