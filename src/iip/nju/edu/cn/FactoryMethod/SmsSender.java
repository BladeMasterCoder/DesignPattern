package iip.nju.edu.cn.FactoryMethod;

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
