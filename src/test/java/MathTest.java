import org.junit.Assert;
import org.junit.Test;

import static org.example.Math.*;
public class MathTest {
    @Test
    public void additionTest() {
        Assert.assertEquals(add(2,3), 5);
    }

    @Test
    public void additionTest2() {
        Assert.assertEquals(add(9,9), 81);
    }

    @Test
    public void subtractionTest() {
        Assert.assertEquals(sub(2,5), -3);
    }

    @Test
    public void multiplicationTest() {
        Assert.assertEquals(mult(20,5), 100);
    }

    @Test
    public void multiplicationTest2() {
        Assert.assertEquals(mult(-5,5), -25);
    }

    @Test
    public void divisionTest() {
        Assert.assertEquals(div(10,5), 2);
    }

}
