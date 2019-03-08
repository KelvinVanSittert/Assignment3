package group3b;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MathFormulasTest {

    @Test
    public void multiplication() {

        MathFormulas math = new MathFormulas();

        Assert.assertEquals(20, math.multiplication(5,4));
    }
}