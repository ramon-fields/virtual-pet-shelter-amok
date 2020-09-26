import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DogTest {

    @Test
    public void shouldDecreaseHungerBy10WhenFed() {
        Dog underTest = new Dog("Odie", "Loving seemingly dopey and kind.", 50,50,50,50);
        underTest.feed();
        int currentHunger = underTest.getHunger();
        assertEquals(currentHunger, 40);
    }

    @Test
    public void shouldDecreaseThirstBy10WhenWatered() {
        Dog underTest = new Dog("Odie", "Loving seemingly dopey and kind.", 50,50,50,50);
        underTest.quenchThirst();
        int currentThirst = underTest.getThirst();
        assertEquals(currentThirst, 40);
    }

    @Test
    public void shouldDecreaseBoredomBy10WhenPlaying() {
        Dog underTest = new Dog("Odie", "Loving seemingly dopey and kind.", 50,50,50,50);
        underTest.play();
        int currentBoredom = underTest.getBoredom();
        assertEquals(currentBoredom, 40);
    }
}
