package homeworks;

import java.util.ArrayList;

 class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
}

public class HomeworkPartTwo {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    // 1. Calculator + add
    public static void task1() {
        Calculator calculator = new Calculator();
        int result = calculator.add(5, 3);
        System.out.println("Task 1: " + result);
    }

    // 2. Масив з 5 імен
    public static void task2() {
        String[] students = {"Ivan", "Oleg", "Anna", "Maria", "Sofia"};

        System.out.println("Task 2:");
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
    }

    // 3. ArrayList з містами
    public static void task3() {
        ArrayList<String> cities = new ArrayList<>();

        cities.add("Kyiv");
        cities.add("Lviv");
        cities.add("Odessa");
        cities.add("Dnipro");

        System.out.println("Task 3: " + cities);
    }

    // 4. Метод ділення + try-catch
    public static void task4() {
        System.out.println("Task 4:");
        divide(10, 0);
    }

    public static void divide(int a, int b) {
        try {
            int result = a / b;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("На нуль ділити не можна");
        }
    }

    // 5. expected / actual
    public static void task5() {
        String expected = "Login successful";
        String actual = "Login successful";

        System.out.println("Task 5:");
        if (expected.equals(actual)) {
            System.out.println("Тест пройдено");
        } else {
            System.out.println("Тест не пройдено");
        }
    }
}
