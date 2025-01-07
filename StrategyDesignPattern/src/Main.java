import WithStrategyPattern.GoodsVehcile;
import WithStrategyPattern.SportsVehcile;
import WithStrategyPattern.Vehcile;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Vehcile goodsVehcile = new GoodsVehcile();
        goodsVehcile.drive();
        Vehcile sportsVehcile = new SportsVehcile();
        sportsVehcile.drive();

    }
}