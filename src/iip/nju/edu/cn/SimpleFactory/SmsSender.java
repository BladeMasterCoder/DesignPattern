package iip.nju.edu.cn.SimpleFactory;

/***
 * 
 * 短信发送实现类
 * 
 * @author mayday
 *
 */
public class SmsSender implements Sender{

	@Override
	public void send() {
		System.out.println("This is Sms Sender!");
	}
}
