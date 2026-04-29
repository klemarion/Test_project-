package homeworks.basics;

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
}
