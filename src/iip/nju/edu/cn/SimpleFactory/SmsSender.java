package iip.nju.edu.cn.SimpleFactory;

/***
 * 
 * ���ŷ���ʵ����
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
