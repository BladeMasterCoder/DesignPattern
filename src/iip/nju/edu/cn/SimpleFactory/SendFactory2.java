package iip.nju.edu.cn.SimpleFactory;


/***
 * 
 * ��������ļ򵥹���,SendFactory1��,������ݵ��ַ�������,
 * ������ȷ��������,�������������ģʽ���ṩ�����������,�ֱ𴴽�����
 * 
 * @author mayday
 *
 */

public class SendFactory2 {
	
	public Sender produceMail(){
		return new MailSender();
	}
	
	public Sender produceSms(){
		return new SmsSender();
	}
	
	
	/**
	 * ���Թ�����
	 * 
	 * @param args
	 */
	public static void main(String[] args){
		
		SendFactory2 factory = new SendFactory2();
		
		Sender sender = factory.produceMail();
		
		sender.send();
		
	}
	
}
