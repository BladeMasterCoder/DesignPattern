package iip.nju.edu.cn.Proxy;

public class ProxySubject implements Subject{

	
	// ����ʵ��ɫ��Ϊ�����ɫ������
	private  RealSubject realSubject;
	
	public  ProxySubject()  {
		super();
		this.realSubject = new  RealSubject();
	}
	
	@Override
	public void request() {
		before();
	    this.realSubject.request();  // �˴�ִ����ʵ�����request����
		atfer();
	}
	
	private void atfer() {  
        System.out.println("after proxy!");  
    }  
	
    private void before() {  
        System.out.println("before proxy!");  
    } 

}
