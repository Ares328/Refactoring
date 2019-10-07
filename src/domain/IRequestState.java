package domain;

public interface IRequestState {
    void remove(Product product);
    void loan(Product product,boolean isDamaged);
    void reinstate(Product product);
    void repair(Product product);

}
