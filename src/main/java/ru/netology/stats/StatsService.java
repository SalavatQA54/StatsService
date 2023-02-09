package ru.netology.stats;

public class StatsService {
    public int calcSum(long[] sales) {
        //сумма всех продаж
        int sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int findAvg(long[] sales) {
        int avgSales;
        avgSales = calcSum(sales) / sales.length;
        return avgSales;
    }

    public int calcMinSales(long[] sales) {
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

    public int calcMaxSales(long[] sales) {
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

    public long countMonthsUnderAverage(long[] sales) {
        long averageSum = findAvg(sales);

        long monthsUnderAverage = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSum) {
                monthsUnderAverage++;
            }
        }
        return monthsUnderAverage;
    }

    public long countMonthsAboveAverage(long[] sales) {
        long averageSum = findAvg(sales);

        long monthsAboveAverage = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageSum) {
                monthsAboveAverage++;
            }
        }
        return monthsAboveAverage;
    }
}