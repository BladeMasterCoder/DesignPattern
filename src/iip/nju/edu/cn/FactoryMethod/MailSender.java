package iip.nju.edu.cn.FactoryMethod;

/***
 * 
 * �ʼ�����ʵ����
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
