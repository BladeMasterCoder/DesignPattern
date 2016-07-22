package iip.nju.edu.cn.SimpleFactory;

/***
 * 简单工厂类
 *
 * @author mayday
 *
 */

public class SendFactory1 {
	

	
	/**
	 * 根据type不同，生产不同产品
	 * @param type
	 * @return
	 */
	public Sender produce(String type){
		if("mail".equals(type)){
			return new MailSender();
		}else if ("sms".equals(type)){
			return new SmsSender();
		}else{
			System.out.println("请输入正确的类型");
			return null;
		}
	}
	
	/**
	 * 测试工厂类
	 * 
	 * @param args
	 */
	public static void main(String[] args){
		
		SendFactory1 factory = new SendFactory1();
		
		Sender sender = factory.produce("sms");
		
		sender.send();
		
	}
	
	
}
