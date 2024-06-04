public class ExtraCheese extends ToppingDecorator {
    private final BasePizza basePizza;

    ExtraCheese(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return basePizza.cost() + 40;
    }
}
