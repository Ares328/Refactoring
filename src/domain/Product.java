package domain;

import java.io.Serializable;

public abstract class Product implements Serializable {
    private static int COUNT;
    private int id;
    private String title;
    private IRequestState currentState;

    public Product(String title){
        id = ++COUNT;
        setTitle(title);
        currentState = new LendableState();
    }

    public abstract double getPrice(int days);

    public void setCurrentState(IRequestState state){ currentState = state;}

    public IRequestState getCurrentState(){return currentState;}

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void remove(){
        currentState.remove(this);
    }

    public void reinstate(){
        currentState.reinstate(this);
    }

    public void loan(boolean isDamaged){
        currentState.loan(this,isDamaged);
    }

    public void repair(){
        currentState.repair(this);
    }

    @Override
    public String toString() {
        return "ID: "+ id +
                ", Title: " + title +
                " , State: " + currentState.getClass().getSimpleName();
    }
}
