package iip.nju.edu.cn.Singleton;

/***
 * 
 * ˫�ؼ��ʵ�ֵ���ģʽ
 * 
 * @author mayday
 *
 */
public class Singleton1 {

	private Singleton1(){
		
	}
	
	private static volatile Singleton1 instance = null;
	
	public Singleton1 getInstance(){
		
		if(instance == null){
			synchronized(Singleton1.class){
				if(instance == null){
					instance = new Singleton1();
				}
			}
		}
		
		return instance;
	}
	
}
