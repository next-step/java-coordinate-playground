package coordPrac;

public class Tea extends CaffeineBev {
    void prepareRecipe() {
        boilWater();
        steepTeaBag();
        pourInCup();
        addLemon();
    }

    private void addLemon() {
        System.out.println("레몬을 추가한다");
    }

    private void steepTeaBag() {
        System.out.println("티백을 담근다");
    }
}
