package ru.netology.service;

import static org.testng.Assert.*;


public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @org.testng.annotations.Test
    public void return1000For0() {
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;
        assertEquals(actual, expected, "Actual bonuses not equals expected");
    }

    @org.testng.annotations.Test
    public void return1For999() {
        int amount = 999;
        int actual = service.remain(amount);
        int expected = 1;
        assertEquals(actual, expected, "Actual bonuses not equals expected");
    }

    @org.testng.annotations.Test
    public void return999For1() {
        int amount = 1;
        int actual = service.remain(amount);
        int expected = 999;
        assertEquals(actual, expected, "Actual bonuses not equals expected");
    }

    @org.testng.annotations.Test
    public void return0For1000() {
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected, "Actual bonuses not equals expected");
    }
}