package iip.nju.edu.cn.Builder;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        StarbucksBuilder coffeeBuilder = new CoffeeBuilder();
 
        //也可以用泡茶builder沏茶
        //StarbucksBuilder teaBuilder = new TeaBuilder();
 
        waiter.setStarbucksBuilder(coffeeBuilder);
        waiter.constructStarbucks();
 
        //取到饮料
        Starbucks drink = waiter.getstarbucksDrink();
 
        StringBuilder sb = new StringBuilder();
        
        
    }
}