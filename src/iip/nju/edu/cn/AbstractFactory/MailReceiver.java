package iip.nju.edu.cn.AbstractFactory;

/***
 * 
 * �ʼ�����ʵ����
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
