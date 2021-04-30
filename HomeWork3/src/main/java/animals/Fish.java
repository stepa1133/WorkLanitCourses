package animals;

import enums.AviarySize;
import interfaces.Swim;

public class Fish extends Herbivore implements Swim {

    public Fish() {
    }

    public Fish(String name) {
        super(name, AviarySize.MEDIUM);
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
