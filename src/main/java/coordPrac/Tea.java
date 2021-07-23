package coordPrac;

public class Tea extends CaffeineBev {

    public void addCondiments() {
        System.out.println("레몬을 추가한다");
    }

    public void brew() {
        System.out.println("티백을 담근다");
    }

    @Override
    public boolean isCoffee() {
        return false;
    }
}
