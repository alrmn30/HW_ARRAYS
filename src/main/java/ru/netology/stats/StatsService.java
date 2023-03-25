package ru.netology.stats;
public class StatsService {

    public int allSalesSum(int[] sales) {
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
            }
        return sum;
    }

    public double averageSalesPerMonth(int[] sales) {
        int sum = allSalesSum(sales);
        return sum / sales.length;
    }

    public int giveMaxSalesMonth(int[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if ( sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth +1;
    }

    public int giveMinSalesMonth(int[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int monthsWithBelowAverageSales(int[] sales) {
        double averageSale = averageSalesPerMonth(sales);
        int belowAvMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageSale) {
                belowAvMonth++;
            }
        }
        return belowAvMonth;
    }

    public int monthsWithAboveAverageSales(int[] sales) {
        double averageSale = averageSalesPerMonth(sales);
        int aboveAvMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSale) {
                aboveAvMonth++;
            }
        }
        return aboveAvMonth;
    }
}
