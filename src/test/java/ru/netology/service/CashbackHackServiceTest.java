package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;
import ru.netology.service.CashbackHackService;

public class CashbackHackServiceTest {

    @Test
    public void testLessThanBoundary() {
        CashbackHackService cashbackService = new CashbackHackService();
        int amount = 800;
        int expected = 200; // 1000 - 800 = 200
        int actual = cashbackService.remain(amount);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testEqualsBoundary() {
        CashbackHackService cashbackService = new CashbackHackService();
        int amount = 1000;
        int expected = 0; // 1000 - 1000 = 0
        int actual = cashbackService.remain(amount);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGreaterThanBoundary() {
        CashbackHackService cashbackService = new CashbackHackService();
        int amount = 1200;
        int expected = 0; // Все, что больше 1000, возвращается с 0
        int actual = cashbackService.remain(amount);
        Assert.assertEquals(expected, actual);
    }
}