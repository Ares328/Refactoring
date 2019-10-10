package domain;

import java.io.Serializable;

public class DamagedState extends RequestState implements Serializable {
    // Damaged goes to lendable and removed
    @Override
    public void remove(Product product) {
        product.setCurrentState(new RemovedState());
    }

    @Override
    public void repair(Product product) {
        product.setCurrentState(new LendableState());
    }
}
