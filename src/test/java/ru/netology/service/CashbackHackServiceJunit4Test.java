package ru.netology.service;


public class CashbackHackServiceJunit4Test {
    @org.junit.Test
    public void shouldReturn1IfAmountIs999() {
        // Тестовые данные
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 999;
        // Целевое действие
        int actual = cashbackHackService.remain(amount);
        // Проверка
        int expected = 1;
        org.junit.Assert.assertEquals(expected, actual);

    }

    @org.junit.Test
    public void shouldReturn999IfAmountIs1001() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1001;
        int actual = cashbackHackService.remain(amount);
        int expected = 999;
        org.junit.Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void shouldReturn0IfAmountIs1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;
        int actual = cashbackHackService.remain(amount);
        int expected = 0;
        org.junit.Assert.assertEquals(expected, actual);

    }

    @org.junit.Test
    public void testJunit4NotNull() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 500;
        int actual = cashbackHackService.remain(amount);
        org.junit.Assert.assertNotNull(actual);

    }

}
