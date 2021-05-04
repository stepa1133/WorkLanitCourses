package animals;

import enums.AviarySize;
import interfaces.Run;
import interfaces.Swim;
import interfaces.Voice;

public class Chicken extends Herbivore implements Run, Swim, Voice {

    public Chicken() {
    }

    public Chicken(String name) {
        super(name, AviarySize.SMALL);
    }

    @Override
    public void run() {
        System.out.println("Я " + this.getClass().getSimpleName() + " я умею бегать!");
    }

    @Override
    public void swim() {
        System.out.println("Я " + this.getClass().getSimpleName() + " я умею плавать!");
    }

    @Override
    public String voice() {
        return "Цып-цып";
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
