package animals;

import interfaces.Run;
import interfaces.Swim;
import interfaces.Voice;

public class Bear extends Carnivore implements Run, Swim, Voice {

    public Bear() {
    }

    public Bear(String name) {
        super(name);
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
}
