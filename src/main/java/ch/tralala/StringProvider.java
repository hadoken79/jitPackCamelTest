package ch.tralala;

public class StringProvider {
    private String testString;
    public StringProvider(){
        this.testString = "bar";
    }
    public String getMsg(String in){
        return in + " " + testString;
    }
}
