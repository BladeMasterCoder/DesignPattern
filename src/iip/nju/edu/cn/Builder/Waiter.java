package iip.nju.edu.cn.Builder;

public class Waiter {
    private StarbucksBuilder starbucksBuilder;
 
    public void setStarbucksBuilder(StarbucksBuilder builder) {
        starbucksBuilder = builder;
    }
 
    public Starbucks getstarbucksDrink() {
        return starbucksBuilder.getStarbucks();
    }
 
    public void constructStarbucks() {
        starbucksBuilder.createStarbucks();
        starbucksBuilder.buildDrink();
        starbucksBuilder.buildSize();
    }
}