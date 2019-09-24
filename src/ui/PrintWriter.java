package ui;

import domain.*;

import java.io.*;
import java.util.Scanner;

public class PrintWriter {

    public void loadProductsFromFile(Shop shop) {
        File shoptxt = new File("shop.txt");
        try {
            Scanner scannerFile = new Scanner(shoptxt);  		// scanner for File
            while (scannerFile.hasNextLine()) {  				// each line of file
                Scanner scannerline = new Scanner(scannerFile.nextLine());  	// scanner for line
                scannerline.useDelimiter(",");  				// seperated by "/"
                String ProductType = scannerline.next();
                String idS = scannerline.next();		// first line (id) till "/"
                int id = Integer.parseInt(idS);
                String title = scannerline.next(); 				// second line (title) till "/"
                String isLoanedS = scannerline.next();           //third line (isLoaned) till "/"
                boolean isLoaned = Boolean.parseBoolean(isLoanedS);

                //This is really crappy cause I don't know how to do it, heeeelppp haha :)
                if(ProductType.equals("Game")){
                    Product product = new Game(id,title,isLoaned);
                    shop.addProduct(product);
                }else if(ProductType.equals("Movie")){
                    Product product = new Movie(id,title,isLoaned);
                    shop.addProduct(product);
                }else{
                    Product product = new CD(id,title,isLoaned);
                    shop.addProduct(product);
                }
                //till here
            }
        }  catch (FileNotFoundException ex) {
            throw new IllegalArgumentException("Error while reading", ex);
        }
    }

    public void saveProductsToFile(Shop shop) {
        File shoptxt =new File("shop.txt");
        try {
            java.io.PrintWriter printWriter = new java.io.PrintWriter(shoptxt);
            printWriter.print(shop.showAllProducts());
            printWriter.close();
        }  catch (FileNotFoundException ex) {
            throw new IllegalArgumentException("Error while writing", ex);
        }
    }
}
