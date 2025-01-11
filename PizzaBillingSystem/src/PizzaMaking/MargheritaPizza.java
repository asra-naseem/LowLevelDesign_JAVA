package PizzaMaking;

public class MargheritaPizza implements BasePizza{

    @Override
    public int getCost() {
        return 110;
    }

    @Override
    public String getDescription() {
        return "Its a Margherita Pizza";
    }
}
