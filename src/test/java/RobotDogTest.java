import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RobotDogTest {

    @Test
    public void shouldDecreaseOilBy10WhenOiled() {
        RobotDog underTest = new RobotDog("BuddyBot", "Man's best friend.",50,50);
        underTest.oilRobot();
        int currentOil = underTest.getOiled();
        assertEquals(currentOil, 40);
    }

}
