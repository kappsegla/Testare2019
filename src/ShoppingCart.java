import java.util.ArrayList;

public class ShoppingCart {

    Customer customer;
    ArrayList<Product> products = new ArrayList<Product>();

    ShoppingCart(Customer customer){
        this.customer = customer;
    }

    public void addProduct(Product product){
        products.add(product);
    }

    public ArrayList<Product> getProducts(){
        return products;
    }

    public static void main(String[] args) {
        Customer c = new Customer();
        ShoppingCart sc = new ShoppingCart(c);

        //Best solution
        sc.addProduct(new Product());





    }


}
