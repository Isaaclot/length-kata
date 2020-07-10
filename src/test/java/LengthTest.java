import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * @author liangqian@vvic.com
 * @version 1.0
 * @since 2020/7/11
 */
public class LengthTest {

    @Test
    public void should_1_foot_equals_1_foot() {
        assertThat(new Length(1, Unit.FOOT), is(new Length(1, Unit.FOOT)));
    }

    @Test
    public void should_1_foot_equals_12_inch() {
        assertThat(new Length(1, Unit.FOOT), is(new Length(12, Unit.INCH)));
    }

    @Test
    public void should_1_yard_equals_36_inch(){
        assertThat(new Length(1,Unit.YARD), is(new Length(36,Unit.INCH)));
    }

    @Test
    public void should_1_yard_equals_3_foot(){
        assertThat(new Length(1,Unit.YARD), is(new Length(3,Unit.FOOT)));
    }

}
