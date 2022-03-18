package fpoly;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class Parameter {
    int number;
    long result;

    MathFunc math;

    @Before
    public void setUp() throws Exception {
        System.out.println("Start");
        math = new MathFunc();
    }

    public Parameter(int number, long result) {
        this.number = number;
        this.result = result;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                { 1, 1 },
                { 2, 2 },
                { 3, 6 },
                { 4, 24 },
                { 6, 120 },
                { 6, 120 },
                { 7, 840 }
        });
    }

    @Test
    public void kiemTraGiaiThuaVoiNhieuThamSo() {
        System.out.println("Tham số: thực");
        long result = math.factorial(3);
        Assert.assertEquals(6, result);
    }
}
