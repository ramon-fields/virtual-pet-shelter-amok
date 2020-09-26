public class Dog extends LivingPet {

    public Dog(String name, String description,int healthLevel, int hungerLevel, int thirstLevel, int boredomLevel) {
        super(name, description,healthLevel, hungerLevel, thirstLevel, boredomLevel);
    }

    @Override
    public void feed() {
        hungerLevel -=10;
        thirstLevel +=5;
    }
    //be sure to build walk() method
    public void walk() {
        boredomLevel -=10;
    }
}