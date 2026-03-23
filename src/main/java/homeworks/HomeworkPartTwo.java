package homeworks;

import org.testng.annotations.Test;

import java.util.ArrayList;

public class HomeworkPartTwo {

    @Test(description = "Масив з 5 імен")
    public void task2() {
        String[] students = {"Ivan", "Oleg", "Anna", "Maria", "Sofia"};

        System.out.println("Task 2:");
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
    }

    @Test(description = "ArrayList з містами")
    public void task3() {
        ArrayList<String> cities = new ArrayList<>();

        cities.add("Kyiv");
        cities.add("Lviv");
        cities.add("Odessa");
        cities.add("Dnipro");

        System.out.println("Task 3: " + cities);
    }

    @Test(description = "Метод ділення + try-catch")
    public void task4() {
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

    @Test(description = "expected / actual")
    public void task5() {
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
