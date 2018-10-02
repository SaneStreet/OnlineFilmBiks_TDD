import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DirectorTest {

    @Test
    void testDirector(){
        //director = "Ron Howard"

        //3. setup
        Director dir = new Director("Ron Howard");

        //2. Execution
        String director = dir.director;

        //1. Assert
        assertEquals("Ron Howard", director);
    }
}
