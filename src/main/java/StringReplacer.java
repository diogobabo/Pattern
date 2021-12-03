import static java.lang.Character.*;

public class StringReplacer implements StringTransformer{
    private char a,b;
    public StringReplacer(char a,char b){
        this.a = a;
        this.b = b;
    }


    @Override
    public void execute(StringDrink drink) {
        StringBuilder temp = new StringBuilder();

        for(int x = 0; x < drink.getText().length();x++){
            if(drink.getText().charAt(x) == this.a)
                temp.append(this.b);
            else
                temp.append(drink.getText().charAt(x));


        }
        drink.setText(temp.toString());
    }
}
