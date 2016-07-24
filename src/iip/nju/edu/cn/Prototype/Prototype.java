package iip.nju.edu.cn.Prototype;

import java.util.ArrayList;


/***
 * 
 * ʹ��ԭ��ģʽ���������ֱ��newһ��������������Ҫ�õĶ࣬��ΪObject���
 * clone������һ�����ط�������ֱ�Ӳ����ڴ��еĶ����������ر��Ǹ��ƴ����ʱ�����ܵĲ��ǳ����ԡ�
 * 
 * @author mayday
 *
 */

public class Prototype implements Cloneable{
	
	private ArrayList<Integer> list = new ArrayList<Integer>();
	
	@SuppressWarnings("unchecked")
	public Prototype clone(){ 		
        Prototype prototype = null; 
        try{ 
            prototype = (Prototype)super.clone(); 
            prototype.list = (ArrayList<Integer>)this.list.clone(); //���    
        }catch(CloneNotSupportedException e){ 
            e.printStackTrace(); 
        } 
        return prototype;  
    } 
	
}
