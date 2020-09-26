import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CatTest {

    Cat underTest = new Cat("Garfield", "Overweight lazy and sarcastic.", 50,50,50, 50);

    @Test
    public void shouldDecreaseHungerBy10WhenFed() {
        underTest.feed();
        int currentHunger = underTest.getHunger();
        assertEquals(currentHunger, 40);
    }

    @Test
    public void shouldDecreaseThirstBy10WhenWatered() {
        underTest.quenchThirst();
        int currentThirst = underTest.getThirst();
        assertEquals(currentThirst, 40);
    }

    @Test
    public void shouldDecreaseBoredomBy10WhenPlaying() {
        underTest.play();
        int currentBoredom = underTest.getBoredom();
        assertEquals(currentBoredom, 40);
    }
}
