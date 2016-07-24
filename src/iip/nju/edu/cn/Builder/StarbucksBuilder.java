package iip.nju.edu.cn.Builder;

public abstract class StarbucksBuilder {
    protected Starbucks starbucks;
 
    public Starbucks getStarbucks() {
        return starbucks;
    }
 
    public void createStarbucks() {
        starbucks = new Starbucks();
        System.out.println("a drink is created");
    }
 
    public abstract void buildSize();
    public abstract void buildDrink();
}