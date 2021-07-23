package coordPrac;

public class Tea {
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

    private void pourInCup() {
        System.out.println("컵에 붓는다");
    }

    private void boilWater() {
        System.out.println("물을 끓인다");
    }
}
