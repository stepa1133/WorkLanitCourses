package food;

public class Grass extends Food{

    public Grass(String name) {
        super(name);
    }

    @Override
    public int getSaturation(){
        return (int) (Math.random() * 50) + 1; // от 1 до 50
    }
}
