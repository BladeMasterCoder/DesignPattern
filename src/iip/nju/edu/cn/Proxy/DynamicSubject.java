package iip.nju.edu.cn.Proxy;

import java.lang.reflect.Method;
import java.lang.reflect.InvocationHandler;

public class DynamicSubject implements InvocationHandler {
	
	
	
	private Object obj;
	
	public Object getProxy(Object obj){								//����ʵ������		
		this.obj = obj;	 
		return java.lang.reflect.Proxy.newProxyInstance(			//ȡ�ô������
								obj.getClass().getClassLoader(),    //���ɴ�������ֽ��������
								obj.getClass().getInterfaces(),     //��Ҫ����Ľӿڣ���������ʵ�ֵĶ���ӿڶ����������ﶨ��
								this);								
	}
	
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
	   
		System.out.println( " before calling "  + method);
		System.out.println("��������    �� "+ proxy.getClass().getName());
		System.out.println("���÷������� "+ method.getName());
		
	    Object object = method.invoke(this.obj,args);

	    System.out.println( " after calling "  + method);
	    
	    return  object;
	}	
	
}
