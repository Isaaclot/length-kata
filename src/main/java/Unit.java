/**
 * @author liangqian@vvic.com
 * @version 1.0
 * @since 2020/7/11
 */
public enum  Unit {
     FOOT(12, "foot"),
     YARD(36, "yard"), INCH(1, "inch");

    private final int baseInchConvert;
    private final String unit;

    Unit(int baseInchConvert, String unit) {

        this.baseInchConvert = baseInchConvert;
        this.unit = unit;
    }

    public int getBaseInchConvert() {
        return baseInchConvert;
    }

    public String getUnit() {
        return unit;
    }

}
