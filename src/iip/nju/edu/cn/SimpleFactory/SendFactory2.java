package iip.nju.edu.cn.SimpleFactory;


/***
 * 
 * 多个方法的简单工厂,SendFactory1中,如果传递的字符串出错,
 * 则不能正确创建对象,而多个工厂方法模式是提供多个工厂方法,分别创建对象
 * 
 * @author mayday
 *
 */

public class SendFactory2 {
	
	public Sender produceMail(){
		return new MailSender();
	}
	
	public Sender produceSms(){
		return new SmsSender();
	}
	
	
	/**
	 * 测试工厂类
	 * 
	 * @param args
	 */
	public static void main(String[] args){
		
		SendFactory2 factory = new SendFactory2();
		
		Sender sender = factory.produceMail();
		
		sender.send();
		
	}
	
}
