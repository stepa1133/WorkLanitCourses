import animals.*;
import food.Food;
import food.Grass;
import food.Meat;
import interfaces.Swim;
import interfaces.Voice;

import java.util.ArrayList;

public class Zoo {
    private ArrayList<Animals> allAnimals = new ArrayList<>();
    private ArrayList <Worker> allWorkers = new ArrayList<>();
    private ArrayList <Food> allFood = new ArrayList<>();
    private ArrayList <Swim> lakeAnimals = new ArrayList<>();

    private String name;


    public Zoo(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

        Zoo zoo = new Zoo("Зоопарк имени Ленина");
/*
*   Создаем и добавляем все объекты - животные в ArrayList <Animals> allAnimals
*/
        zoo.allAnimals.add(new Bear("Потап"));
        zoo.allAnimals.add(new Chicken("Цыпа"));
        zoo.allAnimals.add(new Duck("Дональд"));
        zoo.allAnimals.add(new Fish("Немо"));
        zoo.allAnimals.add(new Lion("Шрам"));
        zoo.allAnimals.add(new Shark("Акулыч"));

/*
 *  Создаем и добавляем все объекты - работники в ArrayList <Worker> allWorkers
 */
        zoo.allWorkers.add(new Worker("Михалыч"));
        zoo.allWorkers.add(new Worker("Клавдия Михайловна"));

/*
 *  Создаем и добавляем все объекты - еда в ArrayList <Food> allFood
 */
        zoo.allFood.add(new Grass("Подорожник"));
        zoo.allFood.add(new Grass("Сено"));
        zoo.allFood.add(new Grass("Пшено"));
        zoo.allFood.add(new Meat("Оленятина"));
        zoo.allFood.add(new Meat("Тушенка"));
        zoo.allFood.add(new Meat("Свинина"));

/*
 *  Добавляем все объекты - животные из allAnimals в ArrayList <Swim> lakeAnimals
 */
        zoo.lakeAnimals.add((Swim) zoo.allAnimals.get(0)); // Добавили объект класса Bear - "Потап" в список водоплавающих
        zoo.lakeAnimals.add((Swim) zoo.allAnimals.get(1)); // Добавили объект класса Chicken - "Цыпа" в список водоплавающих
        zoo.lakeAnimals.add((Swim) zoo.allAnimals.get(2)); // Добавили объект класса Duck - "Дональд" в список водоплавающих
        zoo.lakeAnimals.add((Swim) zoo.allAnimals.get(3)); // Добавили объект класса Fish - "Немо" в список водоплавающих
        zoo.lakeAnimals.add((Swim) zoo.allAnimals.get(5)); // Добавили объект класса Shark - "Акулыч" в список водоплавающих





    }
}
