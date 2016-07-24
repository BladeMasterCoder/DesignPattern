package iip.nju.edu.cn.AbstractFactory;

/***
 * 
 * 邮件接收实现类
 * 
 * @author mayday
 *
 */
public class MailReceiver implements Receiver{

	@Override
	public void receive() {
		System.out.println("This is Sms MailReceiver!");
	}

}
