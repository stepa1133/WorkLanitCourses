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
    private ArrayList <Animals> lakeAnimals = new ArrayList<>();

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

        zoo.allWorkers.add(new Worker("Михалыч"));
        zoo.allWorkers.add(new Worker("Клавдия Михайловна"));

        zoo.allFood.add(new Grass("Подорожник"));
        zoo.allFood.add(new Grass("Сено"));
        zoo.allFood.add(new Grass("Пшено"));
        zoo.allFood.add(new Meat("Оленятина"));
        zoo.allFood.add(new Meat("Тушенка"));
        zoo.allFood.add(new Meat("Свинина"));

        for (Animals animal : zoo.allAnimals) {
            if (animal instanceof Swim){
                zoo.lakeAnimals.add(animal);
            }
        }

        zoo.startWork();

    }

    public void startWork() {
        StringBuilder namesAnimal = new StringBuilder();
        StringBuilder namesWorker = new StringBuilder();
        StringBuilder namesLakeAnimals = new StringBuilder();


        for (Animals animal : allAnimals){
            namesAnimal.append(animal.getClass().getSimpleName() + "-" + animal.getName() + "\n");
        }

        for (Worker worker : allWorkers){
            namesWorker.append(worker.getName() + "\n");
        }

        for (Animals animal : lakeAnimals){
            namesLakeAnimals.append(animal.getClass().getSimpleName() + "-" + animal.getName() + "\n");
        }

        System.out.println(name + " приветствует посетителей!!\n"
                           + "У нас есть такие животные, как:\n"
                           +  namesAnimal.toString() + "\n"
                           + "в пруду плавают:\n"
                           + namesLakeAnimals + "\n"
                           + "А сейчас наши доблестные работники :\n"
                           + namesWorker.toString() + "будут кормить животных! И Заставлять их вызывать звуки!");
l1:
        for (int i = 0; i < allAnimals.size() ; i++) {
            Animals currentAnimal = allAnimals.get(i);
            for (int j = 0; j < allFood.size(); j++) {
                Food currentFood = allFood.get(j);
                System.out.println(allWorkers.get(0).getName() + " будет пробовать кормить животное "
                                  + currentAnimal.getClass().getSimpleName() + " по имени " + currentAnimal.getName()
                                  + " едой - " + currentFood.getName());
                System.out.println("Текущий уровень сытости животного "
                                  + currentAnimal.getClass().getSimpleName() + " по имени " + currentAnimal.getName()
                                  + " - " + currentAnimal.getSaturation() + "%");


                if (currentAnimal.getSaturation() >= 100){
                    System.out.println(currentAnimal.getClass().getSimpleName() + " по имени " + currentAnimal.getName() +" наелось\n");
                    continue l1;
                }
                else {
                    allWorkers.get(0).feed(currentAnimal, currentFood);
                    System.out.println("\n");
                }
            }
        }


        System.out.println("За работы приступает " + allWorkers.get(1).getName() + ", она будет мучить животных");

        for (Animals currentAnimal : allAnimals){
            if (currentAnimal instanceof Voice){
                System.out.println(currentAnimal.getClass().getSimpleName() + " по имени " + currentAnimal.getName()
                                  +" издаёт звук - "
                                  + ((Voice) currentAnimal).voice());
            }
        }

    }
}
