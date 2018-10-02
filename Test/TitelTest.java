import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TitelTest {

    @Test
    void testTitel(){
        //titel = "Tester Jester"

        //3. Setup
        Titel titel1 = new Titel("Tester Jester");

        //2. Execution
        String titel = titel1.titel;

        //1. Assert
        assertEquals("Tester Jester", titel);
    }
}
