package iip.nju.edu.cn.AbstractFactory;

public class MailFactory implements Factory{

	@Override
	public Sender createSender() {	
		return new MailSender();
	}

	@Override
	public Receiver createReceiver() {
		return new MailReceiver();
	}

}
