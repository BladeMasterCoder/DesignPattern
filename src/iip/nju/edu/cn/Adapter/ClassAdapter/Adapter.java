package iip.nju.edu.cn.Adapter.ClassAdapter;
/***
 * 
 * ������������˵��Ҫ�ﵽ��������ã���Ҫ�̳�Դ����Adaptee����ʵ��Ŀ��ӿ�Target
 * 
 * @author mayday
 *
 */
public class Adapter extends Adaptee implements Target{

	@Override
	public void request() {
		super.doSth();	//ͨ��Adaptee�Ĺ�����ʵ��Target�Ĺ���
	}
	
}
