import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by user on 29.09.2017.
 */
public class testCircle {
    @Test
    public void test_1_circle() {
        circle A = new circle();
        double r =0.9;
        A.R=r;
        assertEquals(Math.PI * r * r, A.area(), 0.01);
    }

}
