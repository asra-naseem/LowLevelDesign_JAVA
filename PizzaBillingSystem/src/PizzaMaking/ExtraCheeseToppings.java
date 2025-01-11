package PizzaMaking;

public class ExtraCheeseToppings extends PizzaToppings{
    public ExtraCheeseToppings(BasePizza pizza) {
        super(pizza);
    }

    @Override
    public int getCost() {
        return pizza.getCost()+2;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription()+" with Extra cheese";
    }
}
