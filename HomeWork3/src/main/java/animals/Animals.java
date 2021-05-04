package animals;

import enums.AviarySize;
import food.Food;

public abstract class Animals {

    private int saturation;
    private String name;
    AviarySize aviarySize;
//---
    public Animals() {
        saturation = (int) (Math.random() * 100) + 1;
    }

    public Animals(String name, AviarySize aviarySize) {
        this.name = name;
        this.aviarySize = aviarySize;
        saturation = (int) (Math.random() * 100) + 1;
    }
//---
    public abstract void eat (Food food) throws WrongFoodException;
//---
    public int getSaturation() {
        return saturation;
    }
//---
    public void setSaturation(int saturation) {
        if (saturation + this.saturation >= 100){
            this.saturation = 100;
        }
        else {
            this.saturation += saturation;
        }
    }
//---
    public String getName() {
        return name;
    }
//---
    public void setName(String name) {
        this.name = name;
    }
//---

    public AviarySize getAviarySize() {
        return aviarySize;
    }
}
