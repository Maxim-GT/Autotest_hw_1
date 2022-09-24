package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {

    @Test
    public void testRemainUnderLimit() {
        int expected = 100;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(900);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemainEqualsLimit() {
        int expected = 0;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1000);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemainOverLimit() {
        int expected = 999;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1001);
        Assert.assertEquals(expected, actual);
    }
}