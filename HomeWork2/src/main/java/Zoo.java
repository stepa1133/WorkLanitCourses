import animals.*;
import food.Food;
import food.Grass;
import food.Meat;
import interfaces.Swim;
import interfaces.Voice;

import java.util.ArrayList;

public class Zoo {
    private ArrayList<Animals> allAnimals = new ArrayList<>();
    private ArrayList <Food> allFood = new ArrayList<>();
    private ArrayList <Swim> lakeAnimals = new ArrayList<>();

    private String name;


    public Zoo(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Zoo zoo = new Zoo("Зоопарк имени Ленина");

        zoo.allAnimals.add(new Bear("Потап"));
        zoo.allAnimals.add(new Chicken("Цыпа"));
        zoo.allAnimals.add(new Duck("Дональд"));
        zoo.allAnimals.add(new Fish("Немо"));
        zoo.allAnimals.add(new Lion("Шрам"));
        zoo.allAnimals.add(new Shark("Акулыч"));



        Worker worker = new Worker("Клавдия Михайловна");

        zoo.allFood.add(new Grass("Подорожник"));
        zoo.allFood.add(new Grass("Сено"));
        zoo.allFood.add(new Grass("Пшено"));
        zoo.allFood.add(new Meat("Оленятина"));
        zoo.allFood.add(new Meat("Тушенка"));
        zoo.allFood.add(new Meat("Свинина"));

        zoo.lakeAnimals.add((Swim)zoo.allAnimals.get(1)); //Chicken
        zoo.lakeAnimals.add((Swim)zoo.allAnimals.get(2)); //Duck
        zoo.lakeAnimals.add((Swim)zoo.allAnimals.get(3)); //Fish
        zoo.lakeAnimals.add((Swim)zoo.allAnimals.get(5)); //Shark

        for (Swim swimAnimal: zoo.lakeAnimals){
            swimAnimal.swim();
        }
        

        for (int i = 0; i < zoo.allAnimals.size()-1 ; i++) {
            for (int j = 0; j < zoo.allFood.size()-1; j++) {
                worker.feed(zoo.allAnimals.get(i),zoo.allFood.get(j));
            }
        }

        worker.getVoice((Voice) zoo.allAnimals.get(0));
        worker.getVoice((Voice) zoo.allAnimals.get(1));
        worker.getVoice((Voice) zoo.allAnimals.get(2));
        worker.getVoice((Voice) zoo.allAnimals.get(4));







    }
}
