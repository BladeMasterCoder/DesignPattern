package iip.nju.edu.cn.Proxy;

public class Test {
	
	
	public static void main(String[] args) throws Throwable {
		
		Subject sub = new  RealSubject();
		
		
		
		Subject  obj = (Subject) new DynamicSubject().getProxy(sub);
	
		obj.request();
	}
	

}
