package cs6420.sample_app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void appHasAGreeting() {
        assertEquals(new App().getGreeting(), "Hello world.", "Greeting is not correct");
    }
}
