package iip.nju.edu.cn.Proxy;

public class ProxySubject implements Subject{

	
	// 以真实角色作为代理角色的属性
	private  RealSubject realSubject;
	
	public  ProxySubject()  {
		super();
		this.realSubject = new  RealSubject();
	}
	
	@Override
	public void request() {
		before();
	    this.realSubject.request();  // 此处执行真实对象的request方法
		atfer();
	}
	
	private void atfer() {  
        System.out.println("after proxy!");  
    }  
	
    private void before() {  
        System.out.println("before proxy!");  
    } 

}
