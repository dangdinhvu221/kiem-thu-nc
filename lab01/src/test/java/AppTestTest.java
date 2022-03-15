import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTestTest {

    @Test
    void isEventNumber() {
        assertTrue(AppTest.isEventNumber(2));
    }
    @Test
    void isEventNumber2() {
        assertTrue(AppTest.isEventNumber(6));
    }
    @Test
    void isEventNumber3() {
        assertTrue(AppTest.isEventNumber(4));
    }
}