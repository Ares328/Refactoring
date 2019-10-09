package domain;

import java.io.Serializable;

public class DamagedState implements IRequestState, Serializable {
    // Damaged goes to lendable and removed
    @Override
    public void remove(Product product) {
        product.setCurrentState(new RemovedState());
    }

    @Override
    public void loan(Product product) {

    }

    @Override
    public void reinstate(Product product, boolean isDamaged) {

    }

    @Override
    public void repair(Product product) {
        product.setCurrentState(new LendableState());
    }
}
