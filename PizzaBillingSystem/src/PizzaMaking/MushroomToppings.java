package PizzaMaking;

public class MushroomToppings extends PizzaToppings{

    public MushroomToppings(BasePizza pizza) {
        super(pizza);
    }

    @Override
    public int getCost() {
        return 5+pizza.getCost();
    }

    @Override
    public String getDescription() {
        return pizza.getDescription()+ " with Mushroom";
    }
}
