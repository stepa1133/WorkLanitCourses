package animals;
import food.Food;
import food.Grass;
/*
 * Класс - плотоядные
 */



public class Carnivore extends Animals {

    public Carnivore() {
    }

    public Carnivore (String name) {
        super(name);
    }

    @Override
    public void eat(Food food) {

        if (food instanceof Grass){
            System.out.println("Данное животное плотоядное, оно не может кушать траву!");
            return;
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
