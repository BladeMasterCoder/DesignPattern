package iip.nju.edu.cn.Decorator;

public class Decorator implements Sourceable {  
  
    private Sourceable source;  
      
    public Decorator(Sourceable source){  
        super();  
        this.source = source;  
    }  
    @Override  
    public void method() {  
        System.out.println("before decorator!");  // 写相关的业务代码
        source.method();  
        System.out.println("after decorator!");   // 写相关的业务代码
    }  
}  