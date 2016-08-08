package iip.nju.edu.cn.Strategy;

import java.util.*;

/***
 * 
 * 
 * ����һϵ�е��㷨,������һ������װ����, ����ʹ���ǿ��໥�滻����ģʽʹ���㷨�ı仯�ɶ�����ʹ�����Ŀͻ���
 * 
 * ��ͬ�������㷨����װ���˲�ͬ��Comparator����ʹ��Collections.sort����ʱ�����벻ͬ��Comparator
 * ����ʵ�ְ��ղ�ͬ�������㷨�Լ��Ͻ����������������㷨����ڱ�����Ķ��󱻶��������ˡ�
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
		 * ����һ����С��������
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
		 * ���Զ����Ӵ�С����
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
