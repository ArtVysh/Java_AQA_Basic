package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashBackHackerTest {


    @Test
    public void testSimpleAmount() {
        CashBackHacker service = new CashBackHacker();
        int actual = service.remain(400);
        int expected = 600;

        assertEquals(actual, expected);
    }

    @Test
    public void testWhenAmountEqualBoundary() {
        CashBackHacker service = new CashBackHacker();
        int actual = service.remain(1000);
        int expected = 0;

        assertEquals(actual, expected);
    }

    @Test
    public void testZeroAmount() {
        CashBackHacker service = new CashBackHacker();
        int actual = service.remain(0);
        int expected = 1000;

        assertEquals(actual, expected);
    }

    @Test
    public void testNegativeAmount() {
        CashBackHacker service = new CashBackHacker();
        int actual = service.remain(-1);
        int expected = 1001;

        assertEquals(actual, expected);
    }

    @Test
    public void testPositiveAmount() {
        CashBackHacker service = new CashBackHacker();
        int actual = service.remain(1);
        int expected = 999;

        assertEquals(actual, expected);
    }

}