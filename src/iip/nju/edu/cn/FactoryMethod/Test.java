package iip.nju.edu.cn.FactoryMethod;

/***
 * �򵥹���ģʽ��һ��������ǣ���Ĵ������������࣬Ҳ����˵�������Ҫ��չ���򣬱���Թ���������޸ģ���Υ���˱հ�ԭ��.
 * ���ԣ�����ƽǶȿ��ǣ���һ�������⣬��ν�������õ���������ģʽ������һ�������ӿںʹ����������ʵ���࣬����һ����Ҫ
 * �����µĹ��ܣ�ֱ�������µĹ�����Ϳ����ˣ�����Ҫ�޸�֮ǰ�Ĵ��롣
 * 
 * @author mayday
 *
 */


public class Test {

	public static void main(String[] args) {
		Factory provider = new SendMailFactory();  
        Sender sender = provider.produce();  
        sender.send();
	}

}
