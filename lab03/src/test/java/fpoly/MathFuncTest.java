package fpoly;

import org.junit.*;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class MathFuncTest {

    MathFunc math;

    @Before
    public void setUp() throws Exception {
        math = new MathFunc();
    }

    @After
    public void tearDown() throws Exception {
        math = null;
    }

    @Ignore
    @Test
    public void todo() {
        assertTrue(math.plus(1, 1) == 3);
    }

    @Test
    public void getCalls() {

    }

    @Test
    public void factorial() {
        assertTrue(math.factorial(0) == 1);
        assertTrue(math.factorial(1) == 1);
        assertTrue(math.factorial(5) == 120);
    }

    @Test(expected = IllegalArgumentException.class)
    public void factorialNegative() {
        math.factorial(-1);
    }

    // bắt ngoại lệ với chú thích test
    @Test(expected = IllegalArgumentException.class)
    public void testGiaithualasoam() throws Exception {
        math.factorial(1);
        math.factorial(2);
        math.factorial(11);

    }

    // bắt ngoại lệ với trycatch
    @Test
    public void kiemtraTrycathch() throws Exception {
        try {
            math.factorial(-1);
            math.factorial(22);
            math.factorial(21);
            fail("Không bắt được ngoại lệ");
        } catch (IllegalArgumentException e) {
        }
    }

    // bắt ngoại lệ với trycatch kèm chú thích lỗi ngoại lệ
    @Test
    public void kiemtraTrycathch1() throws Exception {
        try {
            math.factorial(-1);
            math.factorial(22);
            math.factorial(21);
            fail("Không bắt được ngoại lệ");
        } catch (IllegalArgumentException e) {
            assertEquals("Không được nhập vào số âm và trong khoảng 0 -> 20: ", e.getMessage());
        }
    }

    // bắt ngoại lệ theo quy tắc Rule
    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void kiemtraRule() throws Exception {
        exception.expect(IllegalArgumentException.class);
        math.factorial(-1);
        math.factorial(22);
        math.factorial(21);
    }


    @Test
    public void plus() {
        assertEquals(0, math.getCalls());
        math.factorial(1);
        assertEquals(1, math.getCalls());
        math.factorial(1);
        assertEquals(2, math.getCalls());
    }
}