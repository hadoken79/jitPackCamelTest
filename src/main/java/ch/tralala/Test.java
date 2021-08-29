package ch.tralala;

public class Test {
    private String testString;
    public Test(){
        this.testString = "bar";
    }
    public String getMsg(String in){
        return in + " " + testString;
    }
}
