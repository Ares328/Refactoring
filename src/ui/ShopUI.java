package ui;

import domain.*;
import helpers.SessionManager;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ShopUI implements SessionManager {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Product product = new Movie(5,"test",false);
        Product product1 = new Movie(6,"test",false);
        Product product3 = new Game(2,"test",false);
        Product product2 = new Movie(4,"test",false);
        shop.addProduct(product);
        shop.addProduct(product1);
        shop.addProduct(product3);
        shop.addProduct(product2);

        System.out.println(shop.showAllProducts());
    }



    @Override
    public void loadProductsFromFile(Shop shop) {
        File shoptxt = new File("shop.txt");
        try {
            //Not finished yet, "writer.println(shop.showAllProducts());" this line needs to change to probably a loop
            //where we can put the products in seperately
            PrintWriter writer = new PrintWriter(shoptxt);
            writer.println(shop.showAllProducts());
            writer.close();
        }  catch (FileNotFoundException ex) {
            throw new IllegalArgumentException("Error while writing", ex);
        }
    }

    @Override
    public void saveProductsToFile(Shop shop) {
        //Working on it not finished yet!

        ArrayList<Product> products = new ArrayList<>(); 		// all info
        File shoptxt = new File("shop.txt");
        try {
            Scanner scannerFile = new Scanner(shoptxt);  		// scanner for File
            while (scannerFile.hasNextLine()) {  				// each line of file
                Scanner scannerline = new Scanner(scannerFile.nextLine());  	// scanner for line
                scannerline.useDelimiter("/");  				// seperated by "/"
                String id = scannerline.next();		// first line (id) till "/"
                String title = scannerline.next(); 				// second line (title) till "/"
                String isLoaned = scannerline.next();           //third line (isLoaned) till "/"
                /*
                Shop persoon = new Product(id,title,isLoaned);
                personen.add(persoon);
                */
            }
        }  catch (FileNotFoundException ex) {
            throw new IllegalArgumentException("Fout bij het inlezen", ex);
        }
    }
}
