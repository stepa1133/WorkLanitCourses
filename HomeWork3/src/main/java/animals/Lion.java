package animals;

import enums.AviarySize;
import interfaces.Run;
import interfaces.Swim;
import interfaces.Voice;

public class Lion extends Carnivore implements Run, Voice {

    public Lion() {
    }

    public Lion(String name) {
        super(name, AviarySize.BIG);
    }

    @Override
    public void run() {
        System.out.println("Я " + this.getClass().getSimpleName() + " я умею бегать!");
    }



    @Override
    public String voice() {
        return "Аурррр";
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
