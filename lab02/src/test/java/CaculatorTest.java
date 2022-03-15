import org.junit.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CaculatorTest {
    static Caculator caculator;

    @BeforeClass
    public static void setUpClass() throws Exception {
        System.out.println("Start");
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        System.out.println("End");

    }

    @Before
    public void setUp() throws Exception {
        caculator = new Caculator();
    }

    @After
    public void tearDown() throws Exception {
        caculator = null;
    }

    @Test
    public void tong() {
        assertEquals(3, caculator.Tong(1,2));

    }

    @Test
    public void tru() {
        assertEquals(3, caculator.Tru(5,2));

    }

    @Test
    public void nhan() {
        assertEquals(3, caculator.Nhan(1,3));

    }

    @Test
    public void chia() {
        assertEquals(3, caculator.Chia(6,2));

    }

    @Test
    public void giaiPTBac2() {
    }
}