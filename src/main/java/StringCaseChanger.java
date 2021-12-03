import static java.lang.Character.*;

public class StringCaseChanger implements StringTransformer {
    @Override
    public void execute(StringDrink drink) {
        StringBuilder temp = new StringBuilder();
        for(int x = 0; x < drink.getText().length();x++){
            if(isLowerCase(drink.getText().charAt(x)))
                temp.append(toUpperCase(drink.getText().charAt(x)));
            else
                temp.append(toLowerCase(drink.getText().charAt(x)));

        }
        drink.setText(temp.toString());
    }
}
