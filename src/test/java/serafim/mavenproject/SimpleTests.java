package serafim.mavenproject;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SimpleTests {
    @Test
    public void verifyMath() {
        int result = 2 + 2;
        Assert.assertEquals(result, 4, "Math check");
    }

    @Test
    public void verifyMath2() {
        int result = 3 - 2;
        Assert.assertEquals(result, 1, "Math check");
    }
}