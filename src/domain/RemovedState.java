package domain;

import java.io.Serializable;

public class RemovedState implements IRequestState, Serializable {
    // products don't leave this state
    @Override
    public void remove(Product product) {

    }

    @Override
    public void loan(Product product) {

    }

    @Override
    public void reinstate(Product product, boolean isDamaged) {

    }

    @Override
    public void repair(Product product) {

    }
}
