import java.lang.StringBuilder;
public class StringInverter implements StringTransformer{
    @Override
    public void execute(StringDrink drink) {
        StringBuilder var = new StringBuilder(drink.getText());
        drink.setText(var.reverse().toString());
    }
}
