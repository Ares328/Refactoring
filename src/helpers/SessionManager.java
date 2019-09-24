package helpers;

import domain.Shop;

public interface SessionManager {
    void loadProductsFromFile(Shop shop);

    void saveProductsToFile(Shop shop);
}
