package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GHappyTest {

    @Test
    public void test() {
        GHappy gHappy = new GHappy();
        boolean isHappy = gHappy.gHappy("ggx");
        Assertions.assertTrue(isHappy);
    }
}
