package iip.nju.edu.cn.AbstractFactory;

public class Test {
	
	public static void main(String[] args){
		
		MailFactory factory1 = new MailFactory();
		Sender sender1 = factory1.createSender();
		Receiver receiver1 = factory1.createReceiver();
		sender1.send();
		receiver1.receive();
		
		SmsFactory factory2 = new SmsFactory();
		Sender sender2 = factory2.createSender();
		Receiver receiver2 = factory2.createReceiver();
		sender2.send();
		receiver2.receive();
		
		
	}
	
}
