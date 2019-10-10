package domain;

import java.io.Serializable;

public class LoanedState extends RequestState implements Serializable {

    //loaned goes to damaged and lendable
    @Override
    public void reinstate(Product product, boolean isDamaged) {
        if(isDamaged){
            product.setCurrentState(new DamagedState());
        }else{
            product.setCurrentState(new LendableState());
        }
    }
}
