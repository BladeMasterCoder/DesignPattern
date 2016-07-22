package iip.nju.edu.cn.SimpleFactory;

/***
 * �򵥹�����
 *
 * @author mayday
 *
 */

public class SendFactory1 {
	

	
	/**
	 * ����type��ͬ��������ͬ��Ʒ
	 * @param type
	 * @return
	 */
	public Sender produce(String type){
		if("mail".equals(type)){
			return new MailSender();
		}else if ("sms".equals(type)){
			return new SmsSender();
		}else{
			System.out.println("��������ȷ������");
			return null;
		}
	}
	
	/**
	 * ���Թ�����
	 * 
	 * @param args
	 */
	public static void main(String[] args){
		
		SendFactory1 factory = new SendFactory1();
		
		Sender sender = factory.produce("sms");
		
		sender.send();
		
	}
	
	
}
