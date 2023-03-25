package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void allSalesSum() {
        StatsService service = new StatsService();
        int[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        int expected = 180;
        int actual = service.allSalesSum(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void averageSalesPerMonth() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        double actual = service.averageSalesPerMonth(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void giveMaxSalesMonth() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.giveMaxSalesMonth(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void giveMinSalesMonth() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.giveMinSalesMonth(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void monthsWithBelowAverageSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.monthsWithBelowAverageSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void monthsWithAboveAverageSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.monthsWithAboveAverageSales(sales);
        Assertions.assertEquals(expected, actual);
    }
}
