package iip.nju.edu.cn.State;

import java.util.*;

public class Test {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNextInt()){
			System.out.println(scan.next());
		}
		
		while(scan.hasNextBoolean()){
			System.out.println(scan.next());
		}
		
		
		scan.close();
	}

}
