import characters.NonMagicCharacter;
import equipment.Equipment;
import org.junit.Before;
import org.junit.Test;
import treasure.Treasure;

import static org.junit.Assert.assertEquals;

public class NonMagicTest {

    private NonMagicCharacter nonMagicCharacter;
    @Before
    public void before(){
        nonMagicCharacter = new NonMagicCharacter("Arthur", 50, Equipment.SWORD);

    }
    @Test
    public void charHasNameAndHealth(){
        assertEquals("Arthur", nonMagicCharacter.getName());
        assertEquals(50, nonMagicCharacter.getHealth());
    }

    @Test
    public void canBeDamaged(){
        nonMagicCharacter.takeDamage(10);
        assertEquals(40, nonMagicCharacter.getHealth());
    }

}
