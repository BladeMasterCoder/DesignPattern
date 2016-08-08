package iip.nju.edu.cn.ChainOfResponsibility;


/**
 *有多个对象，每个对象持有对下一个对象的引用，这样就会形成一条链，
 *请求在这条链上传递，直到某一对象决定处理该请求。但是发出者并不清
 *楚到底最终那个对象会处理该请求 
 * */
public abstract class Handler {  
    
    /** 
     * 持有后继的责任对象 
     */  
    protected Handler successor;  
    
    /** 
     * 示意处理请求的方法，虽然这个示意方法是没有传入参数的 
     * 但实际是可以传入参数的，根据具体需要来选择是否传递参数 
     */  
    public abstract void handleRequest();  
    
    /** 
     * 取值方法 
     */  
    public Handler getSuccessor() {  
        return successor;  
    } 
    
    /** 
     * 赋值方法，设置后继的责任对象 
     */  
    public void setSuccessor(Handler successor) {  
        this.successor = successor;  
    }  
      
} 
