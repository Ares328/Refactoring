package domain;

import java.io.Serializable;

public class LendableState implements IRequestState, Serializable {

    @Override
    public void remove(Product product) {

    }

    @Override
    public void loan(Product product, boolean isDamaged) {
        if(!isDamaged)
            product.setCurrentState(new LoanedState());
        //TODO: else if damaged (error message?)
    }

    @Override
    public void reinstate(Product product) {

    }

    @Override
    public void repair(Product product) {

    }
}
