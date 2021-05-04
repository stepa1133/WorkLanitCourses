
import animals.Animals;
import enums.AviarySize;

import java.util.HashMap;


/*
Класс - вольер для животных.
*/
public class Aviary <X extends Animals> {

    private HashMap <String,X> aviaryWithAnimals = new HashMap<>();
    AviarySize size;

    public Aviary(AviarySize size) {
        this.size = size;
    }

    public void insertAnimalInAviary (X animal) {
        if (animal.getAviarySize().ordinal() <= this.size.ordinal()){
            aviaryWithAnimals.put(animal.getName(),animal);
        }
        else {
            System.out.println("Этот вольер не подходит для данного животного по размеру");
        }
    }

    public void deleteFromAviary (Animals animal){
        aviaryWithAnimals.remove(animal.getName());
    }

    public X getLinkAnimal (String name){
        return aviaryWithAnimals.get(name);
    }
}
