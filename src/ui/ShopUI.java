package ui;

import domain.*;

import javax.swing.*;

public class ShopUI {
    public static void main(String[] args) {
        Shop shop = new Shop();
        PrintWriter printWriter = new PrintWriter();
        printWriter.loadProductsFromFile(shop);


        String menu = "1. Add product\n2. Show product\n3. Show rental price\n\n0. Program closes";
        String choiceS = JOptionPane.showInputDialog(menu);
        int choice = Integer.parseInt(choiceS);

        switch(choice) {
            case 0:
                System.out.println("Program closes");
                break;
            case 1:
                System.out.println("Add Product");
                break;
            case 2:
                System.out.println("Show Product");
                break;
            case 3:
                System.out.println("Show rental price");
                break;
            default:
                throw new IllegalArgumentException("Wrong input");
        }


        System.out.println(shop.showAllProducts());
        printWriter.saveProductsToFile(shop);

    }
}
