package tudelft.mirror;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MirrorTest {

    @Test
    public void mirrorEmpty() {
        Mirror mirror = new Mirror();
        String result = mirror.mirrorEnds("");
        Assertions.assertEquals("", result);
    }

    @Test
    public void mirrorNoneInBetween() {
        Mirror mirror = new Mirror();
        String result = mirror.mirrorEnds("abba");
        Assertions.assertEquals("ab", result);
    }

    @Test
    public void mirrorOneInBetween() {
        Mirror mirror = new Mirror();
        String result = mirror.mirrorEnds("abXba");
        Assertions.assertEquals("ab", result);
    }

    @Test
    public void mirrorNoMirror() {
        Mirror mirror = new Mirror();
        String result = mirror.mirrorEnds("abcde");
        Assertions.assertEquals("", result);
    }

}
