package animals;
import enums.AviarySize;
import food.Food;
import food.Meat;
/*
 * Класс - травоядные
 */



public class Herbivore extends Animals {

    public Herbivore() {
    }

    public Herbivore (String name, AviarySize aviarySize) {
        super(name, aviarySize);
    }

    @Override
    public void eat(Food food) throws WrongFoodException {

        if (food instanceof Meat){
            System.out.println("Данное животное травоядное, оно не может кушать мясо!");
            throw new WrongFoodException();
        }


        setSaturation(food.getSaturation());

    }
}
