public abstract class RoboticPet extends VirtualPet {

    protected int oilLevel;

    public RoboticPet(String name, String description,int healthLevel, int oilLevel) {
        super(name, description, healthLevel);
        this.oilLevel = oilLevel;
    }

    public int getOiled() {
        return oilLevel;
    }

    public void oilRobot() {
        oilLevel -=10;
    }
}
