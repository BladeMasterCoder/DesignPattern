package iip.nju.edu.cn.Observer;


/***
 * 
 * ���������һ��һ�Զ��������ϵ,�Ա㵱һ�������״̬�����ı�ʱ,�������������Ķ��󶼵õ�֪ͨ���Զ�ˢ�¡�
 * 
 * @author mayday
 *
 */
public class Test {
	public static void main(String[] args) {  
        Subject sub = new MySubject();  
        sub.add(new Observer1());  
        sub.add(new Observer2());  
          
        sub.operation();  
    }  
}
