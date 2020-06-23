import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author liangqian@vvic.com
 * @version 1.0
 * @since 2020/6/23
 */
public class LengthTest {
    @Test
    public void should_given_1_foot_when_inch_then_12() {
        Length length = new Length(1, Unit.FOOT);
        assertThat(length.parse(Unit.INCH), is(12));
    }

    @Test
    public void should_given_1_yard_when_inch_then_36() {
        Length length = new Length(1, Unit.YARD);
        assertThat(length.parse(Unit.INCH), is(36));
    }

    @Test
    public void should_given_12_inch_when_foot_then_1() {
        Length length = new Length(12, Unit.INCH);
        assertThat(length.parse(Unit.FOOT), is(1));
    }

    @Test
    public void should_given_1_yard_when_foot_then_3() {
        Length length = new Length(1, Unit.YARD);
        assertThat(length.parse(Unit.FOOT), is(3));
    }
}
