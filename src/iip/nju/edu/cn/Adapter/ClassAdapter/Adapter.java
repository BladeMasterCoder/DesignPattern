package iip.nju.edu.cn.Adapter.ClassAdapter;
/***
 * 
 * 对于适配器来说，要达到适配的作用，需要继承源对象Adaptee并且实现目标接口Target
 * 
 * @author mayday
 *
 */
public class Adapter extends Adaptee implements Target{

	@Override
	public void request() {
		super.doSth();	//通过Adaptee的功能来实现Target的功能
	}
	
}
