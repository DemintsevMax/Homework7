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
        System.out.println("Task 3");
        int people = 12_000_000;
        int difference = people / 1000;
        int birth = 17;
        int death = 8;
        for (int year = 1; year <= 10; year++) {
            people = people + (difference * (birth - death));
            System.out.println("Год " + year + " численность населения составляет " + people);
        }
        System.out.println("Task 4");
        int cash = 15000;
        int profit = cash % 7;
        int total3 = 0;
        int year = 0;
        for (; total3 < 12_000_000; year++) {
            total3 = total3 + profit;
            total3 = total3 + cash;
            System.out.println(year + " " + total3);
        }
        System.out.println("Task 5");
        int cash1 = 15000;
        int profit1 = cash % 7;
        int total4 = 0;
        int year1 = 0;
        for (; total4 < 12_000_000; year1++) {
            total4 = total4 + profit1;
            total4 = total4 + cash1;
            if (year1 % 6 == 0) {
                System.out.println(year1 + " " + total4);
            }
        }
        System.out.println("Task 6");
        int cash2 = 15_000;
        double month = 0;
        int profit2 = cash % 7;
        int total5 = 0;
        for (; month <= 108; month = month + 1.5) {
            total5 = total5 + profit2;
            total5 = total5 + cash2;
            if (month % 1.5 == 0) {
                System.out.println(month + " " + total5);
            }
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


