public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        for (int i = 1; i <= 10; i = i + 1) {
            System.out.println(i);
        }

        System.out.println("Задача 2");
        for (int i = 10; i >= 1; i = i - 1) {
            System.out.println(i);
        }

        System.out.println("Задача 3");
        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println(i);
        }

        System.out.println("Задача 4");
        for (int i = 10; i >= -10; i = i - 1) {
            System.out.println(i);
        }

        System.out.println("Задача 5");
        for (int year = 1904; year < 2096; year = year + 4) {
            System.out.println(year + " год является високосным");
        }

        System.out.println("Задача 6");
        for (int sequence = 7; sequence < 98; sequence = sequence + 7) {
            System.out.println(sequence);
        }

        System.out.println("Задача 7");
        for (int sequence = 1; sequence <= 512; sequence = sequence * 2) {
            System.out.println(sequence);
        }

        System.out.println("Задача 8");
        int salary = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + salary;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
        }

        System.out.println("Задача 9");
        int salary2 = 29000;
        int total2 = 0;
        for (int i = 1; i <= 12; i++) {
            total2 = total2 + salary2;
            total2 = total2 + total2 / 100;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total2 + " рублей");
        }

        System.out.println("Задача 10");
        int multiply = 2;
        for (int i = 1; i <= 10; i++) {
            System.out.println("2*" + i + "=" + 2 * i);
        }
    }
}