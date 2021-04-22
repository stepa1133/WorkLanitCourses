package animals;

import interfaces.Run;
import interfaces.Swim;
import interfaces.Voice;

public class Lion extends Carnivore implements Run, Voice {

    public Lion() {
    }

    public Lion(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Я " + this.getClass().getSimpleName() + " я умею бегать!");
    }



    @Override
    public String voice() {
        return "Аурррр";
    }
}
