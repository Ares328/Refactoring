package ui;

import domain.*;

import javax.swing.*;

public class ShopUI {

    private Shop shop;

    public ShopUI(Shop shop) {
        this.shop = shop;
    }

    public void showMenu(){
        String menu = "1. Add product\n2. Show product\n3. Show rental price\n\n0. Program closes";
        int choice = -1;
        while(choice!=0) {
            choice = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch (choice) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    showProduct();
                    break;
                case 3:
                    showRentalPrice();
                    break;
                default:
                    //TODO: message about wrong input
            }
        }
        return;
    }

    public void addProduct() {
        String title = JOptionPane.showInputDialog("Enter the title:");
        if (title.isEmpty()){
            //TODO: show error message
            return;
        }
        String id = JOptionPane.showInputDialog("Enter the id:");
        if (id.isEmpty()){
            //TODO: show error message
            return;
        }
        //TODO: select from list
        String type = JOptionPane.showInputDialog("Enter the type (M for movie/G for game):");
        if (type.isEmpty()){
            //TODO: show error message
            return;
        }

        //TODO: select a class
        shop.addProduct(new Game(Integer.parseInt(id),title,false));
    }

    public void showProduct(){
        Product product = findProduct();
        if (product == null) {
            JOptionPane.showMessageDialog(null, "Product with id " + product.getId() + " not found");
        }
        else JOptionPane.showMessageDialog(null, product.getTitle());
    }

    public void showRentalPrice(){
        Product product = findProduct();
        if (product != null){
            int days = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of days:"));
            JOptionPane.showMessageDialog(null, product.getPrice(days));
        } else JOptionPane.showMessageDialog(null, "Product with id " + product.getId() + " not found");

    }

    public Product findProduct(){
        int id = Integer.parseInt(JOptionPane.showInputDialog("Enter the id:"));
        for (Product product: shop.getProducts()){
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }
}
