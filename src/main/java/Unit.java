/**
 * @author liangqian@vvic.com
 * @version 1.0
 * @since 2020/6/23
 */
public enum Unit {
    FOOT(3),
    INCH(36),
    YARD(1);

    private int value;

    Unit(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
