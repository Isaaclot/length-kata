/**
 * @author liangqian@vvic.com
 * @version 1.0
 * @since 2020/6/23
 */
public class Length {
    private int value;
    private Unit unit;

    public Length(int value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    public int parse(Unit unit) {
        return unit.getValue() * value / this.unit.getValue();
    }
}
