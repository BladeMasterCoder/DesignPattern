package iip.nju.edu.cn.AbstractFactory;

/***
 * 
 * 短信接收实现类
 * 
 * @author mayday
 *
 */
public class SmsReceiver implements Receiver{

	@Override
	public void receive() {
		System.out.println("This is Sms Receiver!");	
	}

}
