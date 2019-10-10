package domain;

import exceptions.OperationNotAvailable;

public abstract class RequestState {
    void remove(Product product) throws OperationNotAvailable {
        throw new OperationNotAvailable("");
    };
    //only for Damaged an lendable
    void loan(Product product) throws OperationNotAvailable{
        throw new OperationNotAvailable();
    };
    //only for lendable
    void reinstate(Product product,boolean isDamaged) throws OperationNotAvailable {
        throw new OperationNotAvailable();
    };
    //only for loaned
    void repair(Product product) throws OperationNotAvailable {
        throw new OperationNotAvailable();
    };
    //only for Damaged

}
