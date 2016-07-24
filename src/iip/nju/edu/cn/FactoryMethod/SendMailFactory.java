package iip.nju.edu.cn.FactoryMethod;

public class SendMailFactory implements Factory {  
    
    @Override  
    public Sender produce(){  
        return new MailSender();  
    }  
}
