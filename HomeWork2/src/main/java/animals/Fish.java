package animals;

import interfaces.Swim;

public class Fish extends Herbivore implements Swim {

    public Fish() {
    }

    public Fish(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println("Я " + this.getClass().getSimpleName() + " я умею плавать!");
    }
}
