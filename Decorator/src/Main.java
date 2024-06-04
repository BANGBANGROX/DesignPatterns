public class Main {
    public static void main(String[] args) {
        BasePizza extraCheese = new ExtraCheese(new VegPizza());
        System.out.println(extraCheese.cost()); // prints 140
        extraCheese = new ExtraCheese(new MargaritaPizza());
        System.out.println(extraCheese.cost()); // prints 190

        BasePizza mushroom = new Mushroom(new VegPizza());
        System.out.println(mushroom.cost()); // prints 160
        mushroom = new Mushroom(new MargaritaPizza());
        System.out.println(mushroom.cost()); // prints 210

        BasePizza mushroomAndExtraCheeseVegPizza = new ExtraCheese(new Mushroom(new VegPizza()));
        System.out.println(mushroomAndExtraCheeseVegPizza.cost()); // prints 200

        BasePizza mushroomAndExtraCheeseMargaritaPizza = new ExtraCheese(new Mushroom(new MargaritaPizza()));
        System.out.println(mushroomAndExtraCheeseMargaritaPizza.cost()); // prints 250
    }
}
