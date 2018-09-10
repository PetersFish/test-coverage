package cn.peter.utils;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Peter Yu 2018/9/7 17:01
 */
public class MathUtilsTest {

    @Test
    public void add() {
        int add = MathUtils.add(1, 2);
        Assert.assertTrue(add == 3);
    }

    @Test
    public void minus() {
    }
}
