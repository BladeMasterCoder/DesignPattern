package iip.nju.edu.cn.Adapter.ObjectAdapter;
/***
 * 
 * 基于对象的适配器，要达到适配的作用，持有Adaptee的对象，并且实现目标接口Target
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
		adaptee.doSth();	//通过Adaptee的功能来实现Target的功能
	}
	
}
