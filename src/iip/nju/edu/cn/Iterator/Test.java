package iip.nju.edu.cn.Iterator;

import java.util.*;

public class Test {
	public static void main(String[] args){
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(3);
		list.add(4);
		list.add(2);
		list.add(1);
		list.add(7);
		list.add(5);
		list.add(6);
		
		Iterator<Integer> iter = list.iterator();
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
		
	}
}
