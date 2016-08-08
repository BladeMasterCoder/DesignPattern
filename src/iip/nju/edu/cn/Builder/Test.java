package iip.nju.edu.cn.Builder;


public class Test {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        StarbucksBuilder coffeeBuilder = new CoffeeBuilder();
 

        waiter.setStarbucksBuilder(coffeeBuilder);
        waiter.constructStarbucks();
 

        Starbucks drink = waiter.getstarbucksDrink();
 
        StringBuilder sb = new StringBuilder();
        
        
    }
}