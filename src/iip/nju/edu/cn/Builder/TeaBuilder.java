package iip.nju.edu.cn.Builder;

public class TeaBuilder extends StarbucksBuilder {
    public void buildSize() {
        starbucks.setSize("large");
        System.out.println("build large size");
    }
 
    public void buildDrink() {
        starbucks.setDrink("tea");
        System.out.println("build tea");
    }
 
}