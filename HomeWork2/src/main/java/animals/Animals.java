package animals;

import food.Food;

public abstract class Animals {
    private int saturation;
    private String name;
//---
    public Animals() {
        saturation = (int) (Math.random() * 100) + 1;
    }

    public Animals(String name) {
        this.name = name;
        saturation = (int) (Math.random() * 100) + 1;
    }
//---
    public abstract void eat (Food food);
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
}
