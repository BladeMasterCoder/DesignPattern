package iip.nju.edu.cn.Flyweight;

import java.util.*;

public class FlyweightFactory {
    private Map<Character,Flyweight> files = new HashMap<Character,Flyweight>();
    
    public Flyweight factory(Character state){
        //�ȴӻ����в��Ҷ���
        Flyweight fly = files.get(state);
        if(fly == null){
            //������󲻴����򴴽�һ���µ�Flyweight����
            fly = new ConcreteFlyweight(state);
            //������µ�Flyweight������ӵ�������
            files.put(state, fly);
        }
        return fly;
    }
}