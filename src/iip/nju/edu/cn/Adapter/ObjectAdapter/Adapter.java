package iip.nju.edu.cn.Adapter.ObjectAdapter;
/***
 * 
 * ���ڶ������������Ҫ�ﵽ��������ã�����Adaptee�Ķ��󣬲���ʵ��Ŀ��ӿ�Target
 * 
 * @author mayday
 *
 */
public class Adapter implements Target{

	private Adaptee adaptee;
	
	public Adapter(Adaptee adaptee){
		super();
		this.adaptee = adaptee;
	}
	
	
	@Override
	public void request() {
		adaptee.doSth();	//ͨ��Adaptee�Ĺ�����ʵ��Target�Ĺ���
	}
	
}
