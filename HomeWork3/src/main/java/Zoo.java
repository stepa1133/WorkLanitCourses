import animals.*;
import enums.AviarySize;
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

/*
 *  Создаем вольеры - для хищников и травоядных
 */
        Aviary <Carnivore> carnivoreAviary = new Aviary<>(AviarySize.VERY_BIG);
        Aviary <Herbivore> herbivoreAviary = new Aviary<>(AviarySize.VERY_BIG);

/*
 *  Добавляем в вольер для хищников наших хищных животных из списка AllAnimals
 */
        carnivoreAviary.insertAnimalInAviary((Carnivore) zoo.allAnimals.get(0)); // Добавили в вольер хищника объект класса Bear - "Потап"
        carnivoreAviary.insertAnimalInAviary((Carnivore) zoo.allAnimals.get(4)); // Добавили в вольер хищника объект класса Lion - "Шрам"
        carnivoreAviary.insertAnimalInAviary((Carnivore) zoo.allAnimals.get(5)); // Добавили в вольер хищника объект класса Shark - "Акулыч"

/*
 *  Проверяем получение ссылки на животное из вольера по имени (Хищники)
 */
        System.out.println(carnivoreAviary.getLinkAnimal("Потап"));
        System.out.println(carnivoreAviary.getLinkAnimal("Шрам"));
        System.out.println(carnivoreAviary.getLinkAnimal("Акулыч"));

/*
 *  Добавляем в вольер для травоядных наших травоядных животных из списка AllAnimals
 */
        herbivoreAviary.insertAnimalInAviary((Herbivore) zoo.allAnimals.get(1)); // Добавили в вольер травоядное объект класса Chicken - "Цыпа"
        herbivoreAviary.insertAnimalInAviary((Herbivore) zoo.allAnimals.get(2)); // Добавили в вольер травоядное объект класса Duck - "Дональд"
        herbivoreAviary.insertAnimalInAviary((Herbivore) zoo.allAnimals.get(3)); // Добавили в вольер травоядное объект класса Fish - "Немо"

/*
 *  Проверяем получение ссылки на животное из вольера по имени (Травоядные)
 */
        System.out.println(herbivoreAviary.getLinkAnimal("Цыпа"));
        System.out.println(herbivoreAviary.getLinkAnimal("Дональд"));
        System.out.println(herbivoreAviary.getLinkAnimal("Немо"));


/*
 *  Удаляем животное из вольера
 */
        carnivoreAviary.deleteFromAviary(zoo.allAnimals.get(0)); // Попробуем удалить Bear - Потап
        System.out.println(carnivoreAviary.getLinkAnimal("Потап"));    // Теперь Bear - Потап нету в вольере для хищников

/*
 *  Проверим работу исключения
 */
        zoo.allWorkers.get(0).feed(zoo.allAnimals.get(0),zoo.allFood.get(0));


    }
}
