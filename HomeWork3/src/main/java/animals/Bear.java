package animals;

import enums.AviarySize;
import interfaces.Run;
import interfaces.Swim;
import interfaces.Voice;




public class Bear extends Carnivore implements Run, Swim, Voice {


    public Bear(String name) {
        super(name,AviarySize.VERY_BIG);
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
        return "рРРрРрР";
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
