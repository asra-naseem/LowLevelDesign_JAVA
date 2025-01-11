package PizzaMaking;

public  abstract class PizzaToppings implements BasePizza{
   protected BasePizza pizza;

   public PizzaToppings(BasePizza pizza){
       this.pizza=pizza;
   }

    @Override
    public abstract int getCost() ;

    @Override
    public abstract String getDescription() ;
}
