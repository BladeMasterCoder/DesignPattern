package iip.nju.edu.cn.AbstractFactory;

/***
 * 
 * ���Ž���ʵ����
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
