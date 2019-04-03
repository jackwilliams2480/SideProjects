public class KeyBoard
{

    private String language;
    int numberOfKeys;
    String color;
    
    public KeyBoard(String lang,String color, int keys)
    {
        // initialise instance variables
        this.language = lang;
        this.color = color;
        this.numberOfKeys = keys;
    }

    public KeyBoard(){
        this("","",0);
    }

    public String getLanguage(){
        return this.language;
    }
    
    public int getnumberOfKeys(){
        return this.numberOfKeys;
    }
    
    public String getColor(){
        return this.color;
    }
}
