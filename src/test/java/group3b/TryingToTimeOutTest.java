package group3b;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class TryingToTimeOutTest {

    @Ignore //Don't run this test if you like your computer, run the entire test case and you will still pass.
    @Test (timeout = 50)
    public void punishComputer() {

        TryingToTimeOut evil = new TryingToTimeOut();

        evil.punishComputer();
    }
}