package iip.nju.edu.cn.Strategy;

import java.util.*;

/***
 * 
 * 
 * 定义一系列的算法,把它们一个个封装起来, 并且使它们可相互替换。本模式使得算法的变化可独立于使用它的客户。
 * 
 * 不同的排序算法被封装成了不同的Comparator，当使用Collections.sort方法时，传入不同的Comparator
 * 即可实现按照不同的排序算法对集合进行排序。于是排序算法相对于被排序的对象被独立出来了。
 * 
 * @author mayday
 */
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
		
		/*
		 * 策略一：从小到大排序
		 */
		Comparator<Integer> c1 = new Comparator<Integer>(){

			@Override
			public int compare(Integer o1, Integer o2) {
				if(o1 > o2){
					return 1;
				}else if (o1 == o2){
					return 0;
				}else{
					return -1;
				}
				
			}
			
		};
		
		Collections.sort(list, c1);
		
		System.out.println(list);
		
		/*
		 * 策略二：从大到小排序
		 */
		Comparator<Integer> c2 = new Comparator<Integer>(){

			@Override
			public int compare(Integer o1, Integer o2) {
				if(o1 < o2){
					return 1;
				}else if (o1 == o2){
					return 0;
				}else{
					return -1;
				}
				
			}
			
		};
		
		
		Collections.sort(list, c2);
		
		
		System.out.println(list);
		
		
	}
}
