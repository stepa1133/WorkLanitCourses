import model.Kotik;

public class Application {
    public static void main(String[] args) {
        Kotik kotik1 = new Kotik(10,"Том",5,"meeeow");

        Kotik kotik2 = new Kotik();
        kotik2.setKotik(12,"Барсик",25,"meeeeooowww");

        System.out.println(kotik1);
        kotik2.liveAnotherDay();

        if (kotik1.getMeow().equals(kotik2.getMeow())) {
            System.out.println("Котики разговаривают одинаково");
        }
        else {
            System.out.println("Котики разговаривают не одинаково");
        }

        System.out.print("Количество созданных котиков:" + Kotik.getCountKotik());
    }
}
