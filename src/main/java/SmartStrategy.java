import java.util.List;

public class SmartStrategy implements OrderingStrategy{
    private StringDrink a;
    private StringRecipe b;
    @Override
    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar) {
        if(bar.isHappyHour())
            bar.order(drink,recipe);
        else{
            a = drink;
            b = recipe;
        }

    }

    @Override
    public void happyHourStarted(StringBar bar) {
        wants(a,b,bar);
    }

    @Override
    public void happyHourEnded(StringBar bar) {

    }
}
