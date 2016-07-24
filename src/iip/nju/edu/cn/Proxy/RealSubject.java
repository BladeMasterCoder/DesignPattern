package iip.nju.edu.cn.Proxy;

public class RealSubject implements Subject{

	public  RealSubject() {}

	
	@Override
	public void request() {
		System.out.println( " From real subject. " );	
	}

}
