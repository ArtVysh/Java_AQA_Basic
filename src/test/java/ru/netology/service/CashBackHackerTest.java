package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;


public class CashBackHackerTest {


    @Test
    public void testSimpleAmount() {
        CashBackHacker service = new CashBackHacker();
        int actual = service.remain(400);
        int expected = 600;

        assertEquals(expected, actual);
    }

    @Test
    public void testWhenAmountEqualBoundary() {
        CashBackHacker service = new CashBackHacker();
        int actual = service.remain(1000);
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void testZeroAmount() {
        CashBackHacker service = new CashBackHacker();
        int actual = service.remain(0);
        int expected = 1000;

        assertEquals(expected, actual);
    }

    @Test
    public void testNegativeAmount() {
        CashBackHacker service = new CashBackHacker();
        int actual = service.remain(-1);
        int expected = 1001;

        assertEquals(expected, actual);
    }

    @Test
    public void testPositiveAmount() {
        CashBackHacker service = new CashBackHacker();
        int actual = service.remain(1);
        int expected = 999;

        assertEquals(expected, actual);
    }

}