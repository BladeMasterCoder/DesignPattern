package iip.nju.edu.cn.FactoryMethod;

public class SendSmsFactory implements Factory{  
  
    @Override  
    public Sender produce() {  
        return new SmsSender();  
    }  
}  