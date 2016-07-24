package iip.nju.edu.cn.Facade;


/***
 * 
 * ���ģʽ,��ϸ�����ϵͳ�Ľӿ�,�����ṩͳһ�������Ľӿ�
 * 
 * @author mayday
 *
 */
public class Facade {
	
	SubSystem1 system1;
	SubSystem2 system2;
	SubSystem3 system3;
	SubSystem4 system4;
	
	
	public Facade(){
		system1 = new SubSystem1();
		system2 = new SubSystem2();
		system3 = new SubSystem3();
		system4 = new SubSystem4();
	}
	

	public void methodA(){
		system1.method1();
		system2.method2();
		system4.method4();
	}
	
	public void methodB(){
		system1.method1();
		system3.method3();
	}
	
}
