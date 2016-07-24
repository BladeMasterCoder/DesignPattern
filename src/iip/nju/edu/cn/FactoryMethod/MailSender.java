package iip.nju.edu.cn.FactoryMethod;

/***
 * 
 * 邮件发送实现类
 * 
 * @author mayday
 *
 */
public class MailSender implements Sender {

	@Override
	public void send() {
		System.out.println("This is Mail Sender!");
	}
}
