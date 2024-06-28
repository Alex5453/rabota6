package ru.netology.stats;

public class StatsService {

    // Метод для расчета суммы всех продаж
    public long calculateTotalSales(long[] sales) {
        long totalSales = 0;
        for (long sale : sales) {
            totalSales += sale;
        }
        return totalSales;
    }

    // Метод для расчета средней суммы продаж в месяц
    public long calculateAverageSales(long[] sales) {
        long totalSales = calculateTotalSales(sales);
        return totalSales / sales.length;
    }

    public int findMaxSalesMonth(long[] sales) {
        int maxMonth = 0;
        long maxSale = sales[0];
        for (int i = 1; i < sales.length; i++) {
            if (sales[i] >= maxSale) {
                maxSale = sales[i];
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }



    // Метод для определения номера месяца с минимальными продажами
    public int findMinSalesMonth(long[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    // Метод для определения количества месяцев с продажами ниже среднего
    public int countMonthsBelowAverage(long[] sales) {
        long averageSales = calculateAverageSales(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale < averageSales) {
                count++;
            }
        }
        return count;
    }

    // Метод для определения количества месяцев с продажами выше среднего
    public int countMonthsAboveAverage(long[] sales) {
        long averageSales = calculateAverageSales(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale > averageSales) {
                count++;
            }
        }
        return count;
    }
}
