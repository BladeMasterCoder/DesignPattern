package iip.nju.edu.cn.SimpleFactory;

/***
 * 
 * �����̬�����ļ򵥹���,SendFactory2����Ҫ����������ʵ��,
 * ����̬������������ֱ�Ӵ�������
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
