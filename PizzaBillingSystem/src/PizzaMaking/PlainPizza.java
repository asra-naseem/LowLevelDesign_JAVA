package PizzaMaking;

public class PlainPizza implements BasePizza{

    @Override
    public int getCost() {
        return 100;
    }

    @Override
    public String getDescription() {
        return "Its a Plain Crust Pizza";
    }
}
