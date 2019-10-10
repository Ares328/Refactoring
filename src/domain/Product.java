package domain;

import exceptions.OperationNotAvailable;

import java.io.Serializable;

public abstract class Product implements Serializable {
    private static int COUNT;
    private int id;
    private String title;
    private RequestState currentState;

    public Product(String title){
        id = ++COUNT;
        setTitle(title);
        currentState = new LendableState();
    }

    public abstract double getPrice(int days);

    public void setCurrentState(RequestState state){ currentState = state;}

    public RequestState getCurrentState(){return currentState;}

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void remove() throws OperationNotAvailable {
        currentState.remove(this);
    }

    public void reinstate(boolean isDamaged) throws OperationNotAvailable {
        currentState.reinstate(this,isDamaged);
    }

    public void loan() throws OperationNotAvailable {
        currentState.loan(this);
    }

    public void repair() throws OperationNotAvailable {
        currentState.repair(this);
    }

    @Override
    public String toString() {
        return "ID: "+ id +
                ", Title: " + title +
                " , State: " + currentState.getClass().getSimpleName();
    }
}
