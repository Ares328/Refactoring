package domain;

import java.io.Serializable;

public class LendableState implements IRequestState, Serializable {
    // lendable goes to removed and loaned
    @Override
    public void remove(Product product) {
        product.setCurrentState(new RemovedState());
    }

    @Override
    public void loan(Product product) {
        product.setCurrentState(new LoanedState());
    }

    @Override
    public void reinstate(Product product, boolean isDamaged) {

    }

    @Override
    public void repair(Product product) {

    }
}
