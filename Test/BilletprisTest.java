import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BilletprisTest {

    @Test
    void testBilletPris(){
        //billetPris = 15.0

        //3. Setup
        Billetpris billet = new Billetpris(15.0);

        //2. Execution
        double billetPris = billet.billetPris;

        //1. Assert
        assertEquals(15.0, billetPris);
    }
    @Test
    void hentBilletPris(){
        //billetPris = 45.25

        //3. Setup
        Billetpris billet = new Billetpris(45.25);

        //2. Execution
        double billetPris = billet.getBilletPris();

        //1. Assert
        assertEquals(45.25, billetPris);
    }
}
