package iip.nju.edu.cn.Proxy;

import java.lang.reflect.Method;
import java.lang.reflect.InvocationHandler;

public class DynamicSubject implements InvocationHandler {
	
	
	
	private Object obj;
	
	public Object getProxy(Object obj){								//绑定真实主题类		
		this.obj = obj;	 
		return java.lang.reflect.Proxy.newProxyInstance(			//取得代理对象
								obj.getClass().getClassLoader(),    //生成代理类的字节码加载器
								obj.getClass().getInterfaces(),     //需要代理的接口，被代理类实现的多个接口都必须在这里定义
								this);								
	}
	
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
	   
		System.out.println( " before calling "  + method);
		System.out.println("代理类名    ： "+ proxy.getClass().getName());
		System.out.println("调用方法名： "+ method.getName());
		
	    Object object = method.invoke(this.obj,args);

	    System.out.println( " after calling "  + method);
	    
	    return  object;
	}	
	
}
