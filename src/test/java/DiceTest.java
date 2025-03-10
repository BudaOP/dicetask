import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.example.Dice;

public class DiceTest {

    @Test
    public void testRoll() {
        Dice dice = new Dice();
        dice.roll();
        assertTrue(dice.getDie1() >= 1 && dice.getDie1() <= 6);
        assertTrue(dice.getDie2() >= 1 && dice.getDie2() <= 6);
    }

    @Test
    public void testIsDouble() {
        Dice dice = new Dice();
        dice.roll();
        boolean isDouble = dice.getDie1() == dice.getDie2();
        assertEquals(isDouble, dice.isDouble());
    }

    @Test
    public void testRollUntilDouble() {
        Dice dice = new Dice();
        int attempts = dice.rollUntilDouble();
        assertTrue(attempts > 0);
        assertTrue(dice.isDouble());
    }
}
