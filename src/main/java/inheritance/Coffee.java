package inheritance;

public class Coffee extends CaffeieneDrinks{

    @Override
    void brew() {
        System.out.println("커피를 내립니다.");
    }

    @Override
    void addIngredients() {
        System.out.println("설탕과 우유를 추가합니다.");
    }
}
