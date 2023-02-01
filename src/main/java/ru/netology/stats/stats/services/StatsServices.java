package ru.netology.stats.stats.services;

public class StatsServices {

    public long getSalesSum(long[] sale) {

        long sum = 0;
        for (int i = 0; i < sale.length; i++) {
            sum = sale[i] + sum;
        }
        return sum;
    }

    public long getMiddleSalesSum(long[] sale) {

        long sum = 0;
        for (int i = 0; i < sale.length; i++) {
            sum = sale[i] + sum;
        }
        return sum / sale.length;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {

            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {

            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int underMiddleSalesDays(long[] sales) {
        long middleSum = getMiddleSalesSum(sales);
        int daysAmount = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < middleSum) {
                daysAmount = daysAmount + 1;
            }

        }
        return daysAmount + 1;

    }

    public int overMiddleSalesDays(long[] sales) {
        long middleSum = getMiddleSalesSum(sales);
        int daysAmount = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > middleSum) {
                daysAmount = daysAmount + 1;
            }

        }
        return daysAmount + 1;

    }

}
