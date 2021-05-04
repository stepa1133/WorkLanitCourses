import animals.Animals;
import animals.WrongFoodException;
import food.Food;
import interfaces.Voice;

public class Worker {
    private String name;

    public Worker(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    void feed (Animals animal, Food food)  {
        try{
            animal.eat(food);
        }catch (WrongFoodException e){ System.out.println("Животное не будет это кушать");}
    }

    void getVoice (Animals animals) {
        if (animals instanceof Voice) {
            System.out.println(((Voice) animals).voice());
        }
        else {
            System.out.println(animals.getClass().getSimpleName() + " не умеет подавать голос!");
        }
    }

}
