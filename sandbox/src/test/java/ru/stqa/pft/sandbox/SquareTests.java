package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SquareTests {

    @Test
    public void testPointFeatures() {
        Point testPoint1 = new Point(3, 2);
        Point testPoint2 = new Point(3, 42);
        Assert.assertSame(testPoint1.coordinate1,3.0);
        Assert.assertSame(testPoint1.coordinate2, 2.0);
        Assert.assertEquals(testPoint1.distance(testPoint2), 40.0);
        Assert.assertEquals(MyFirstClass.distance(testPoint1, testPoint2), 40.0);
    }

}
