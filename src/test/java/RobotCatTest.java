import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RobotCatTest {

    @Test
    public void shouldDecreaseOilBy10WhenOiled() {
        RobotCat underTest = new RobotCat("MeowBot", "This cats is the mastermind type.",50,50);
        underTest.oilRobot();
        int currentOil = underTest.getOiled();
        assertEquals(currentOil, 40);
    }
}
