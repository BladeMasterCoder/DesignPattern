package iip.nju.edu.cn.Prototype;

import java.util.ArrayList;


/***
 * 
 * 使用原型模式创建对象比直接new一个对象在性能上要好的多，因为Object类的
 * clone方法是一个本地方法，它直接操作内存中的二进制流，特别是复制大对象时，性能的差别非常明显。
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
            prototype.list = (ArrayList<Integer>)this.list.clone(); //深拷贝    
        }catch(CloneNotSupportedException e){ 
            e.printStackTrace(); 
        } 
        return prototype;  
    } 
	
}
