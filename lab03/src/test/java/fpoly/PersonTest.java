package fpoly;

import org.junit.*;
import org.junit.rules.ExpectedException;

public class PersonTest {

    @Before
    public void setUp() throws Exception {
        System.out.println("Start");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("End");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testExpectedException(){
        new Person("Fpoly", -1);
    }


    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void testExpectedException1() {
        exception.expect(IllegalArgumentException.class);
        new Person("Fpoly", -1);
    }

    @Test
    public void testExpectedException2() {
        try {
            new Person("Fpoly", -1);
            Assert.fail("ERROR");
        }catch (IllegalArgumentException e){
            System.out.println( e.getMessage());
        }
    }
}