package ui;

import domain.*;
import helpers.SessionManager;

public class ShopUI implements SessionManager {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Product product = new Movie(5,"test",false);
        shop.addProduct(product);

        System.out.println(shop.showAllProducts());
    }



    @Override
    public void loadProductsFromFile(Shop shop) {

    }

    @Override
    public void saveProductsToFile(Shop shop) {

    }
}
