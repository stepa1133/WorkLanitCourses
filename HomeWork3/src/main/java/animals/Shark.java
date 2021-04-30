package animals;

import interfaces.Swim;

public class Shark extends Carnivore implements Swim {

    public Shark() {
    }

    public Shark(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println("Я " + this.getClass().getSimpleName() + " я умею плавать!");
    }
}
