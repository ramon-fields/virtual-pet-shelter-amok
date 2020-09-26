public abstract class LivingPet extends VirtualPet {

    protected int hungerLevel;
    protected int thirstLevel;
    protected int boredomLevel;

    public LivingPet(String name, String description,int healthLevel, int hungerLevel, int thirstLevel, int boredomLevel) {
        super(name, description, healthLevel);
        this.hungerLevel = hungerLevel;
        this.thirstLevel = thirstLevel;
        this.boredomLevel = boredomLevel;
    }

    public int getHunger() {
        return hungerLevel;
    }

    public int getThirst() {
        return thirstLevel;
    }

    public int getBoredom() {
        return boredomLevel;
    }

    public abstract void feed(); //{ hungerLevel -=10; } Overrides in another location.

    public void quenchThirst() {
        thirstLevel -=10;
    }

    public void play() {
        boredomLevel -=10;
    }
}
