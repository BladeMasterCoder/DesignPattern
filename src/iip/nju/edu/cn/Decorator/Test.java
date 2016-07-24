package iip.nju.edu.cn.Decorator;

public class Test {

	public static void main(String[] args) {  
        Sourceable source = new Source();  
        Sourceable obj = new Decorator(source);  
        obj.method();  
    }  

}
