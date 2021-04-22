package model;

public class Kotik {
    private static int countKotik;

    private int satiety; //Переменная, показывающая степень сытости кота.Как только она <=0, кот отказывается
    //делать какое-либо действие кроме eat()


    private int prettiness;
    private String name;
    private int weight;
    private String meow;
//----------------------------------------------------------------------------------------------------------------------
//Конструторы

    public Kotik() {
        countKotik++;
    }

    public Kotik(int prettiness, String name, int weight, String meow){
        this.prettiness=prettiness;
        this.name=name;
        this.weight=weight;
        this.meow=meow;
        countKotik++;
    }

    //--
    public void setKotik(int prettiness, String name, int weight, String meow){
        this.prettiness=prettiness;
        this.name=name;
        this.weight=weight;
        this.meow=meow;
    }
    //----------------------------------------------------------------------------------------------------------------------
//Геттеры
    public static int getCountKotik() {
        return countKotik;
    }

    public int getSatiety() {
        return satiety;
    }

    public int getPrettiness() {
        return prettiness;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public String getMeow() {
        return meow;
    }
    //----------------------------------------------------------------------------------------------------------------------
//Методы
    public boolean play(){            //Играть
        if(satiety<=0){
            return false;
        }
        System.out.println("Котик "+name+" играет");
        satiety-=8;
        return true;
    }

    public boolean sleep(){           //Спать
        if(satiety<=0){
            return false;
        }
        System.out.println("Котик "+name+" спит");
        satiety-=6;
        return true;
    }

    public boolean chaseMouse(){      //Ловить мышь
        if(satiety<=0){
            return false;
        }
        System.out.println("Котик "+name+" ловит мышь");
        satiety-=12;
        return true;
    }

    public boolean wash(){            //Мыться
        if(satiety<=0){
            return false;
        }
        System.out.println("Котик "+name+" купается");
        satiety-=2;
        return true;
    }

    public boolean spoilFurniture(){  //Портить мебель
        if(satiety<=0){
            return false;
        }
        System.out.println("Котик "+name+" портит мебель");
        satiety-=3;
        return true;
    }
    //-----
    public void eat(int valueSatiety){
        satiety+=valueSatiety;
    }
    public void eat(int valueSatiety,String food){
        satiety+=valueSatiety;
    }
    public void eat(){
        eat(10,"Whiskas");
    }
    //-----
    public void liveAnotherDay(){
        for (int i = 0; i < 24; i++) {
            int randomNum=(int)(Math.random()*5+1);
            switch (randomNum){
                case 1:
                    if(!play()){
                        System.out.println("Котик не будет играть, он голоден. Кормим котика");
                        eat();
                        play();
                    }
                    break;
                case 2:
                    if(!sleep()){
                        System.out.println("Котик не будет спать, он голоден. Кормим котика");
                        eat();
                        sleep();
                    }
                    break;
                case 3:
                    if(!chaseMouse()){
                        System.out.println("Котик не будет охотиться на мышь, он голоден. Кормим котика");
                        eat();
                        chaseMouse();
                    }
                    break;
                case 4:
                    if(!wash()){
                        System.out.println("Котик не будет умываться, он голоден. Кормим котика");
                        eat();
                        wash();
                    }
                    break;
                case 5:
                    if (!spoilFurniture()){
                        System.out.println("Котик не будет портить мебель, он голоден. Кормим котика");
                        eat();
                        spoilFurniture();
                    }
                    break;
            }
        }

    }
//---------------------------------------------------------------------------------------------------------------------


    @Override
    public String toString() {
        return "Имя котика: "+ this.name +"\nВес котика: "+this.weight;
    }
}
