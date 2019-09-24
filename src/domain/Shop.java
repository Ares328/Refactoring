package domain;

import helpers.RentManager;

import java.util.ArrayList;

public class Shop implements RentManager {
    private ArrayList<Product> products = new ArrayList<>();



    public String showAllProducts(){
        String uit = "";
        for (Product p: this.products){
            uit += p.toString() + "\n";
        }
        return uit;
    }

    public void addProduct(Product product){
        this.products.add(product);
    }

    @Override
    public double calculatePrice(int id, int days) {
        double cost = 0.0;
        for (Product p : this.products){
            if (p.getId() == id){
                cost = p.getPrice(days);
            }
        }
        return cost;
    }
}
