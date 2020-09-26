public class VirtualPet {

    protected String name;
    protected String description;
    protected int healthLevel;
    private int hungerLevel;
    private int thirstLevel;
    private int boredomLevel;
    private String newPetName;
    private String newPetDescription;

    public VirtualPet(String name, String description, int healthLevel) {
        this.name = name;
        this.description = description;
        this.healthLevel = healthLevel;
    }

    public VirtualPet(String newPetName, String newPetDescription) {
        this.newPetName = newPetName;
        this.newPetDescription = newPetDescription;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getHealth() { return healthLevel;}

    public int getHungerLevel() {return hungerLevel; }

    public int getThirstLevel() {return thirstLevel; }

    public int getBoredomLevel() {return boredomLevel; }

    public void feed() {
        hungerLevel -=10;
        healthLevel +=2;
    }

    public void quenchThirst() {
        thirstLevel -=10;
        healthLevel +=2;
    }

    public void playWith() {
        boredomLevel -=10;
        healthLevel +=2;
    }

    public void walk() {
        boredomLevel -=10;
    }

    public void tick() {
        hungerLevel++;
        thirstLevel++;
        boredomLevel++;
        healthLevel--;
    }
}
