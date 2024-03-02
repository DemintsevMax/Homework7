public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        int salary = 15000;
        int total = 0;
        int i = 0;
        while (total <= 2_459_000) {
            total = total + salary;
            i++;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");

        }
        System.out.println("Task 2");
        int a = 1;
        while (a <= 10) {
            System.out.print(a + " ");
            a++;
        }
        System.out.println(" ");
        for (a = 10; a >= 1; a--) {
            System.out.print(a + " ");
        }
        System.out.println(" ");
        System.out.println("Task 3");
        int people = 12_000_000; // начальная числинность
        int birthRate = 17; // рождаемость
        int deathRate = 8; // смертность
        for (int year = 1; year <= 10; year++) {
            people+=people*(birthRate-deathRate)/1000;

            System.out.println("Год " + year + " численность населения составляет " + people);
        }
        System.out.println("Task 4");
        int cash = 15000;
        int profit = cash/100*7;
        int total3 = 0;
        int month = 1;
        for (; total3 < 12_000_000; month++) {
            total3 = total3 + profit;
            total3 = total3 + cash;
            System.out.println(month + " " + total3);
        }
        System.out.println("Task 5");
        int cash1 = 15000;
        int profit1 = cash/100*7;
        int total4 = 0;
        int month1 = 0;
        for (; total4 <12_000_000; month1++) {
            total4 = total4 + profit1;
            total4 = total4 + cash1;
            if (month1 % 6 == 0) {
                System.out.println(month1 + " " + total4);
            }
        }
        System.out.println("Task 6");
        int cash2 = 15_000;
        int month2 = 0;
        int profit2 = cash/100*7;
        int total5 = 0;
        for (; month2 <= 108; month2 = month2 +6) {
            total5 = total5 + profit2;
            total5 = total5 + cash2;
                System.out.println(month2 + " " + total5);

        }
        System.out.println("Task 7");
        for (int Friday = 1; Friday <= 31; Friday = Friday + 7) {
            System.out.println(Friday);
        }
        System.out.println("Task 8");
        int start = 1824;
        while (start < 2224) {
            System.out.println(start);
            start = start + 79;
        }


    }
}


