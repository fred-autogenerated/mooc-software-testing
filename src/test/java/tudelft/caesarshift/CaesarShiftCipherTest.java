package tudelft.caesarshift;

import org.junit.jupiter.api.Test;

public class CaesarShiftCipherTest {

    @Test
    public void testCipher() {
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        String encrypted = cipher.CaesarShiftCipher("az", 26);
        System.out.println(encrypted);
    }

}
