package iip.nju.edu.cn.AbstractFactory;

public class SmsFactory implements Factory{

	@Override
	public Sender createSender() {
		return new SmsSender();
	}

	@Override
	public Receiver createReceiver() {
		return new SmsReceiver();
	}

}
