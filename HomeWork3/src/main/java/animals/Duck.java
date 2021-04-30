package animals;

import enums.AviarySize;
import interfaces.Fly;
import interfaces.Run;
import interfaces.Swim;
import interfaces.Voice;

public class Duck extends Herbivore implements Run, Fly, Swim, Voice {

    public Duck() {
    }

    public Duck(String name) {
        super(name, AviarySize.MEDIUM);
    }

    @Override
    public void run() {
        System.out.println("Я " + this.getClass().getSimpleName() + " я умею бегать!");
    }

    @Override
    public void fly() {
        System.out.println("Я " + this.getClass().getSimpleName() + " я умею летать!");
    }

    @Override
    public void swim() {
        System.out.println("Я " + this.getClass().getSimpleName() + " я умею плавать!");
    }

    @Override
    public String voice() {
        return "Кря-кря";
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
