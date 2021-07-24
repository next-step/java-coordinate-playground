package coordPrac;

//have abstract methods then class too Abstract
public abstract class CaffeineBev {
    //not private but public since Both Coffee&Tea the same
    void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    //let Coffee&Tea, IMPLEMENT it : without {}
    abstract void addCondiments();

    abstract void brew();

    protected void boilWater() {
        System.out.println("물을 끓인다");
    }

    protected void pourInCup() {
        System.out.println("컵에 붓는다");
    }

    public abstract boolean isCoffee();
}
