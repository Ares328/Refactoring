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
                    System.out.println("Show Product");
                    break;
                case 3:
                    System.out.println("Show rental price");
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
}
