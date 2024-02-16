import control.Order;
import control.Warehouse;
import model.ElectronicsProduct;
import model.FoodProduct;

public class Main {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Order order = new Order();
        ElectronicsProduct Product1 = new ElectronicsProduct("Samsung TV", "123456", 5, 100000);
        ElectronicsProduct Product2 = new ElectronicsProduct("Samsung Phone", "123458", 5, 10000);
        FoodProduct Product3 = new FoodProduct("Bread", "123457", 5, 100);
        warehouse.addProduct(Product1);
        warehouse.addProduct(Product2);
        warehouse.addProduct(Product3);
        System.out.println(warehouse.findProductByArticle("123456"));
        System.out.println(warehouse.findProductByArticle("123457"));
        order.processOrder(Product1, 3);
        System.out.println("Product1 Количество товара = " + Product1.getQuantity());
        order.processOrder(Product2, 6);
        System.out.println("Product2 Количество товара = " + Product2.getQuantity());
        System.out.println(warehouse.getPrice());
    }
}