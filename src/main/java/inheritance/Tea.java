package inheritance;

public class Tea extends CaffeieneDrinks{

    @Override
    void brew() {
        System.out.println("차를 내립니다.");
    }

    @Override
    void addIngredients() {
        System.out.println("레몬을 추가합니다.");
    }
}
