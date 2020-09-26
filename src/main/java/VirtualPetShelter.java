import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

    public Map<String, VirtualPet> pets = new HashMap<>();

    public Collection<VirtualPet> pets() {
        return pets.values();
    }

    public void add(VirtualPet pet) {
        pets.put(pet.getName(), pet);
    }

    //Methods
    public String petStatus() {
        String petStatus ="";
        for (Map.Entry<String, VirtualPet> eachPet : pets.entrySet()) {
            petStatus += eachPet.getValue().getName() +"\t"+ eachPet.getValue().getHealth() +"\t"+ eachPet.getValue().getHungerLevel() +"\t"+ eachPet.getValue().getThirstLevel() +"\t"+ eachPet.getValue().getBoredomLevel();
        }
        return petStatus;
    }

    public void feedAll() {
        for (VirtualPet pet : pets.values()) {
            pet.feed();
        }
    }

    public void quenchThirstAll() {
        for (VirtualPet pet : pets.values()) {
            pet.quenchThirst();
        }
    }

    public String optionMenu() {
            String optionMenu ="";
            for (Map.Entry<String, VirtualPet> eachPet : pets.entrySet()) {
                optionMenu += "Name: " + eachPet.getValue().getName() + eachPet.getValue().getDescription();
            }
            return optionMenu;
    }

    public void play(String name) {
        pets.get(name).playWith();
    }

    public void adopt(String name) {
        pets.remove(name);
    }

    public boolean containsKey(String name) {
        return pets.containsKey(name);
    }

    public void tickMethod() {
        for (VirtualPet pet : pets.values()) {
            pet.tick();
        }
    }

//    public VirtualPet findPet(String petName) {
//        return pets.get(petName);
//    }
}