package domain;

import java.io.Serializable;

public class LoanedState implements IRequestState, Serializable {

    //loaned goes to damaged and lendable
    @Override
    public void remove(Product product) {

    }

    @Override
    public void loan(Product product) {

    }

    @Override
    public void reinstate(Product product, boolean isDamaged) {
        if(isDamaged){
            product.setCurrentState(new DamagedState());
        }else{
            product.setCurrentState(new LendableState());
        }
    }

    @Override
    public void repair(Product product) {

    }
}
