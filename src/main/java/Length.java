/**
 * @author liangqian@vvic.com
 * @version 1.0
 * @since 2020/7/11
 */
public class Length {
    private double amount;


    public Length(double value, Unit unit) {
        amount = value * unit.getBaseInchConvert();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Length length = (Length) o;
        return Double.compare(length.amount, amount) == 0;
    }

}
