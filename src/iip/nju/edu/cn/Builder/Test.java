package iip.nju.edu.cn.Builder;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        StarbucksBuilder coffeeBuilder = new CoffeeBuilder();
 
        //Ҳ�������ݲ�builder���
        //StarbucksBuilder teaBuilder = new TeaBuilder();
 
        waiter.setStarbucksBuilder(coffeeBuilder);
        waiter.constructStarbucks();
 
        //ȡ������
        Starbucks drink = waiter.getstarbucksDrink();
 
        StringBuilder sb = new StringBuilder();
        
        
    }
}