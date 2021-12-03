import java.util.List;

public class StringTransformerGroup implements StringTransformer {

    private List<StringTransformer> a;
    public StringTransformerGroup(List<StringTransformer> a){
        this.a = a;
    }
    public void execute(StringDrink b){
        for(int x = 0 ; x < a.size();x++){
            a.get(x).execute(b);
        }
    }
}
