package homeworks;

public class Product {
    private String name;
    private double price;
    private boolean available;

    public Product(String name, double price, boolean available) {
        this.name = name;
        this.price = price;
        this.available = available;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void printProductInfo() {
        System.out.println("Назва: " + name);
        System.out.println("Ціна: " + price);
        System.out.println("Наявність: " + available);
    }

    public static void main(String[] args) {
        Product phone = new Product("Телефон", 25000.0, true);
        Product laptop = new Product("Ноутбук", 50000.0, true);

        System.out.println("Product objects");
        phone.printProductInfo();
        laptop.printProductInfo();

        DiscountProduct discountedPhone = new DiscountProduct("Телефон", 25000.0, true, 10.0);
        discountedPhone.printProductInfo();
        System.out.println("Телефон зі знижкою: " + discountedPhone.discountPrice());

        DiscountProduct discountedLaptop = new DiscountProduct("Ноутбук", 50000.0, true, 15.0);
        discountedLaptop.printProductInfo();
        System.out.println("Ноутбук зі знижкою: " + discountedLaptop.discountPrice());

        User admin = new Admin();
        User customer = new Customer();

        checkUserRole(admin);
        checkUserRole(customer);
    }

    public static void checkUserRole(User user) {
        System.out.println("Роль: " + user.getRole());

        if (user instanceof Admin) {
            System.out.println("Це об'єкт класу Admin");
        } else if (user instanceof Customer) {
            System.out.println("Це об'єкт класу Customer");
        }
    }

    static class DiscountProduct extends Product {
        private double discount;

        public DiscountProduct(String name, double price, boolean available, double discount) {
            super(name, price, available);
            this.discount = discount;
        }

        public double discountPrice() {
            return getPrice() - (getPrice() * discount / 100);
        }
    }

    static abstract class User {
        public abstract String getRole();
    }

    static class Admin extends User {
        @Override
        public String getRole() {
            return "Admin";
        }
    }

    static class Customer extends User {
        @Override
        public String getRole() {
            return "Customer";
        }
    }
}
