package domain;

public interface IRequestState {
    void remove(Product product);
    //only for Damaged an lendable
    void loan(Product product);
    //only for lendable
    void reinstate(Product product,boolean isDamaged);
    //only for loaned
    void repair(Product product);
    //only for Damaged

}
