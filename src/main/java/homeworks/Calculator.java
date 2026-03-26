package homeworks;

import org.testng.annotations.Test;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    @Test(description = "Домашнє завдання - Створити калькулятор")
    public static void task1() {
        Calculator calculator = new Calculator();
        int result = calculator.add(5, 3);
        System.out.println("Task 1: " + result);
        System.out.printf("тест");
    }
}
