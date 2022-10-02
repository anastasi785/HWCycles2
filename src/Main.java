public class Main {
    public static void main(String[] args) {
        int a = 2;
        int i = 1;
        for (i = 1; i < 11; i++) {
            System.out.println(a + "*" + i + "=" + a * i);
        }

        int currentYear = 2022;
        int oldYear = currentYear - 200;
        int nextYear = currentYear + 100;
        for (int c = 0; c <= nextYear; c = c + 79) {
            if (c >= oldYear) {
                System.out.println(c);
            }

        }
        int salary = 65535;
        int total = 0;
        int n = 0;
        for (; total < 2_459_000; n++) {
            total = total + total / 100;
            total = total + salary;
            System.out.println("Месяц " + n + " Итого " + total);
        }
        int v = 1;
        while (v <= 10) {
            System.out.print(v + " ");
            v++;
        }
        int start = 10;
        for (start = 10; start <= 10 && start >= 0; start--) {
            System.out.print(start + " ");


        }
        var people = 12_000_000;
        var birthRate = people / 1000 * 17;
        var deathRate = people / 1000 * 8;
        var growth = 0;
        var peoplePlus = 0;
        for (int year = 0; year <= 10; year++) {
            growth = birthRate - deathRate;
            peoplePlus = people + growth;
            peoplePlus = people + year * growth;
            System.out.println("year " + year + " amounts of people " + peoplePlus);

        }

        int deposit = 15000;
        int growth1 = deposit / 100 * 7;
        int total1 = 0;
        int h = 0;
        for (; total1 < 12_000_000; h = h + 6) {
            total1 = deposit + (growth1 * h);
            System.out.println("Месяцы " + h + " Сумма " + total1);
        }


        int deposit1 = 15000;
        int growth2 = deposit / 100 * 7;
        int time1 = 9 * 12;
        int total2 = 0;
        for (h = 0; h <= time1; h = h + 6) {
            total2 = deposit1 + (growth2 * h);
            System.out.println("месяц" + h + "Сумма накоплений" + total2);
        }
        int m = 1;
        for (m = 1; m <= 31 && m >= 1; m = m + 7) {
            System.out.println("Сегодня пятница " + m + "-е число. Необходимо подготовить отчет");
        }
    }
}
