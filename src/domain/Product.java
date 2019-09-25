package domain;

import java.io.Serializable;

public abstract class Product implements Serializable {
    private int id;
    private String title;
    private boolean isLoaned;

    public Product(int i,String t,boolean l){
        setId(i);
        setTitle(t);
        setIsLoaned(l);
    }

    public abstract double getPrice(int days);

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
        return id +
                "," + title +
                "," + isLoaned;
    }
}
