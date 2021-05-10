package food;

public class Meat extends Food{

    public Meat(String name) {
        super(name);
    }

    @Override
    public int getSaturation(){
        return (int) (Math.random() * 100) + 1; // от 1 до 100
    }
}
