import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShoppingCartTest {

    @Test
    void addProduct() {
        ShoppingCart shoppingCart = new ShoppingCart(null);

        int start = shoppingCart.products.size();

        shoppingCart.addProduct(new Product());

        assertEquals(start + 1, shoppingCart.products.size());

    }
}