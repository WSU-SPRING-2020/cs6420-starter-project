package cs6420.sample_app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

class AppTest {
    @Test void appHasAGreeting() {
        assertEquals(new App().getGreeting(), "Hello world.", "Greeting is not correct");
    }
}
