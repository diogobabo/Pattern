import java.util.List;

public class StringRecipe {
    private List<StringTransformer> a;
    public StringRecipe(List<StringTransformer> a){
        this.a = a;
    }
    public void mix(StringDrink b){
        for(int x = 0 ; x < a.size();x++){
            a.get(x).execute(b);
        }
    }
}
