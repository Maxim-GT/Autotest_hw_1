package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void testRemainUnderLimit() {
        int expected = 100;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(900);
        assertEquals(actual, expected);
    }

    @Test
    public void testRemainEqualsLimit() {
        int expected = 0;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1000);
        assertEquals(actual, expected);
    }

    @Test
    public void testRemainOverLimit() {
        int expected = 999;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1001);
        assertEquals(actual, expected);
    }
}