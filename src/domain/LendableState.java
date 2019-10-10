package domain;

import java.io.Serializable;

public class LendableState extends RequestState implements Serializable {
    // lendable goes to removed and loaned
    @Override
    public void remove(Product product) {
        product.setCurrentState(new RemovedState());
    }

    @Override
    public void loan(Product product) {
        product.setCurrentState(new LoanedState());
    }

}
