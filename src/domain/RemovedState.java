package domain;

import java.io.Serializable;

public class RemovedState implements IRequestState, Serializable {

    @Override
    public void remove(Product product) {

    }

    @Override
    public void loan(Product product, boolean isDamaged) {

    }

    @Override
    public void reinstate(Product product) {

    }

    @Override
    public void repair(Product product) {

    }
}
