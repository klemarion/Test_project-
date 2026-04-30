package homeworks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Collection {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("Телефон", 25000.0, true));
        products.add(new Product("Ноутбук", 50000.0, true));
        products.add(new Product("Навушники", 3000.0, false));

        for (Product product : products) {
            product.printProductInfo();
            System.out.println();
        }

        HashSet<String> categories = new HashSet<>();
        categories.add("Електроніка");
        categories.add("Одяг");
        categories.add("Побутова техніка");

        System.out.println(categories.contains("Електроніка"));

        HashMap<String, Double> prices = new HashMap<>();
        prices.put("Телефон", 25000.0);
        prices.put("Ноутбук", 50000.0);
        prices.put("Навушники", 3000.0);

        for (Map.Entry<String, Double> entry : prices.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        divide(10, 2);
        divide(10, 0);

        try {
            validatePrice(25000.0);
            System.out.println("Ціна коректна");
        } catch (InvalidPriceException e) {
            System.out.println(e.getMessage());
        }

        try {
            validatePrice(-1.0);
            System.out.println("Ціна коректна");
        } catch (InvalidPriceException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void divide(double a, double b) {
        try {
            if (b == 0) {
                throw new ArithmeticException("Ділення на нуль неможливе");
            }

            System.out.println("Результат: " + (a / b));
        } catch (ArithmeticException e) {
            System.out.println("Помилка: " + e.getMessage());
        } finally {
            System.out.println("Операція завершена.");
        }
    }

    public static void validatePrice(double price) throws InvalidPriceException {
        if (price <= 0) {
            throw new InvalidPriceException("Ціна продукту повинна бути більшою за 0");
        }
    }

    static class InvalidPriceException extends Exception {
        public InvalidPriceException(String message) {
            super(message);
        }
    }
}
