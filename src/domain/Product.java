package domain;

import java.io.Serializable;

public abstract class Product implements Serializable {
    private static int COUNT;
    private int id;
    private String title;
    private boolean isLoaned;

    public Product(String title){
        id = ++COUNT;
        isLoaned = false;
        setTitle(title);
    }

    public abstract double getPrice(int days);

    public int getId() {
        return id;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean getIsLoaned() {
        return isLoaned;
    }

    public void setIsLoaned(boolean loaned) {
        isLoaned = loaned;
    }

    @Override
    public String toString() {
        return "ID: "+ id +
                ", Title: " + title +
                " , Loaned: " + isLoaned;
    }
}
