package ru.netology.service;

import org.testng.annotations.Test;
import ru.netology.service.CashbackHackService;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTestNG {
    @Test
    public void shouldCalculateCashbackFrom1100() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1100;
        int expected = 900;
        int actual = cashbackHackService.remain(amount);

        assertEquals(expected,actual,"Расчет кэшбака произведен неверно");
    }
    @Test
    public void shouldCalculateCashbackFrom999() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int actual = cashbackHackService.remain(999);
        int expected = 1;
        assertEquals(actual, expected,"Расчет кэшбака произведен неверно");
    }

    @Test
    public void shouldCalculateCashbackFrom1001() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int actual = cashbackHackService.remain(1001);
        int expected = 999;
        assertEquals(actual, expected,"Расчет кэшбака произведен неверно");
    }

}