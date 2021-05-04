package animals;
import enums.AviarySize;
import food.Food;
import food.Grass;
/*
 * Класс - плотоядные
 */



public class Carnivore extends Animals {

    public Carnivore() {
    }

    public Carnivore (String name, AviarySize aviarySize) {
        super(name, aviarySize);
    }

    @Override
    public void eat(Food food) throws WrongFoodException {
        if (food instanceof Grass){
            System.out.println("Данное животное плотоядное, оно не может кушать траву!");
            throw new WrongFoodException();
        }



        if (getSaturation() >= 100){
            System.out.println("Животное не хочет кушать!" + " Уровень насыщенности - " + getSaturation() + "%");
        }
        else {
            setSaturation(food.getSaturation());
            System.out.println("Животное покушало!" + " Уровень насыщенности - " + getSaturation() + "%");
        }

    }
}
