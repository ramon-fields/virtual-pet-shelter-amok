public class Cat extends LivingPet {

    public Cat(String name, String description,int healthLevel, int hungerLevel, int thirstLevel, int boredomLevel) {
        super(name, description,healthLevel, hungerLevel, thirstLevel, boredomLevel);
    }

    @Override
    public void feed() {
        hungerLevel -=10;
        thirstLevel +=2;
    }

}