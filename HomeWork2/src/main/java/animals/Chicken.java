package animals;

import interfaces.Run;
import interfaces.Swim;
import interfaces.Voice;

public class Chicken extends Herbivore implements Run, Swim, Voice {

    public Chicken() {
    }

    public Chicken(String name) {
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
        return "Цып-цып";
    }
}
