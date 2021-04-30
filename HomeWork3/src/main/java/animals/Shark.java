package animals;

import enums.AviarySize;
import interfaces.Swim;

public class Shark extends Carnivore implements Swim {

    public Shark() {
    }

    public Shark(String name) {
        super(name, AviarySize.VERY_BIG);
    }

    @Override
    public void swim() {
        System.out.println("Я " + this.getClass().getSimpleName() + " я умею плавать!");
    }

    @Override
    public int hashCode() {
        return getName().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (!(obj instanceof Bear)) return false;
        Bear bear = (Bear) obj;
        return bear.getName().equals(getName());
    }
}
