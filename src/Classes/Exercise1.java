package Classes;

public class Exercise1 {
    private Integer denomination;
    private Integer quantity;
    public Exercise1(Integer denomination, Integer quantity)
    {
        this.denomination = denomination;
        this.quantity = quantity;
    }
    @Override
    public String toString() {
        return
                "denomination='" + denomination + '\'' +
                ", quantity='" + quantity + '\'' +
                ", result='" + denomination * quantity + '\'';
    }
}
