import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CaculatorTest {

    @Test
    void tong() {
        assertEquals(3, Caculator.Tong(1,2));
    }

    @Test
    void tru() {
        assertEquals(3, Caculator.Tru(2,2));

    }

    @Test
    void nhan() {
        assertEquals(3, Caculator.Nhan(1,3));

    }

    @Test
    void chia() {
        assertEquals(3, Caculator.Chia(6,2));
    }

    @Test
    void binhPhuong() {
        assertEquals(8, Caculator.BinhPhuong(2,3));
    }

    @Test
    void canBachai() {
        assertEquals(2, Caculator.canBachai(4));

    }
}