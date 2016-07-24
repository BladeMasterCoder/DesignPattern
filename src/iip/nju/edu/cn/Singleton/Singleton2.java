package iip.nju.edu.cn.Singleton;

/***
 * 
 * 静态内部类实现单例模式
 * 
 * @author mayday
 *
 */
public class Singleton2 {
	
	private Singleton2() {  
    }
	
	private static class SingletonFactory {  
        private static Singleton2 instance = new Singleton2();  
    }  
	
	
	public static  Singleton2 getInstance(){
		return SingletonFactory.instance;
	}
	
}
