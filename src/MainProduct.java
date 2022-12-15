public class MainProduct {
    public static void main(String[] args) {
        Product product1 = new Product("Nasi Goreng", 15000);
        product1.showPrice();

        Product product2 = new Product(2,"Nasi", 1000);
        product2.showPrice();

        Product product3 = new Product(3,"Goreng", 5000);
        product3.showPrice();

        Product product4 = new Product();
        product4.showPrice();
    }
}
