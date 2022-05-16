package ru.netology.stats;

public class StatsService {

    //сумма всех продаж
    public long sum(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    //средняя сумма продаж
    public int averageSum(long[] sales) {
        int averageSum = 0;
        int sum = 0;
        for (long sale : sales) {
            sum += sale;
            averageSum = sum / sales.length;
        }
        return averageSum;
    }

    //Номер месяца, в котором был пик продаж
    public int maxSales(long[] sales) {
        int maxSales = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxSales]) {
                maxSales = i;
            }
        }
        return maxSales + 1;
    }

    //Номер месяца, в котором был минимум продаж
    public int minSales(long[] sales) {
        int mini = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[mini]) {
                mini = i;
            }
        }
        return mini + 1;
    }

    //  Кол-во месяцев, в которых продажи были ниже среднего
    public int amountMonthsLessAverage(long[] sales) {
        int amount = 0;
        int averageSales = averageSum(sales);
        for (long sale : sales) {
            if (sale < averageSales) {
                amount++;
            }
        }
        return amount;
    }

//  Кол-во месяцев, в которых продажи были выше среднего

    public int amountMonthsMoreAverage(long[] sales) {
        int amount = 0;
        int averageSales = averageSum(sales);
        for (long sale : sales) {
            if (sale > averageSales) {
                amount++;
            }
        }
        return amount;
    }
}




