package iip.nju.edu.cn.Singleton;

/***
 * 
 * ��̬�ڲ���ʵ�ֵ���ģʽ
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
