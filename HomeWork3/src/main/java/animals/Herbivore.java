package animals;
import food.Food;
import food.Meat;
/*
 * Класс - травоядные
 */



public class Herbivore extends Animals {

    public Herbivore() {
    }

    public Herbivore (String name) {
        super(name);
    }

    @Override
    public void eat(Food food) {

        if (food instanceof Meat){
            System.out.println("Данное животное травоядное, оно не может кушать мясо!");
            return;
        }

        setSaturation(food.getSaturation());

    }
}
