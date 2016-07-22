package iip.nju.edu.cn.SimpleFactory;

/***
 * 
 * 多个静态方法的简单工厂,SendFactory2中需要创建工厂的实例,
 * 而静态工厂方法可以直接创建对象
 * 
 * @author mayday
 *
 */

public class SendFactory3 {

	
	public static Sender produceMail(){
		return new MailSender();
	}
	
	public static Sender produceSms(){
		return new SmsSender();
	}
	
	public static void main(String[] args) {
		
		Sender sender = SendFactory3.produceMail();
		
		sender.send();
	}
	

}
