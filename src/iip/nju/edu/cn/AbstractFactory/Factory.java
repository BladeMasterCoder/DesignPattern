package iip.nju.edu.cn.AbstractFactory;


public interface Factory {
	
	Sender createSender();
	
	Receiver createReceiver();
	
}
