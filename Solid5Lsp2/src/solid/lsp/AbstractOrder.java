package solid.lsp;

public abstract class AbstractOrder {
    protected int price;
    protected int qnt;


    public AbstractOrder(int qnt, int price) {
        this.price = price;
        this.qnt = qnt;
    } 

    public abstract Integer getAmount();

    @Override
    public String toString() {
    return String.format("Количество = %d, Цена = %d", qnt, price);
    }
}
