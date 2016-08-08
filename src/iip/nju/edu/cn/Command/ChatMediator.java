package iip.nju.edu.cn.Command;

public interface ChatMediator {


    public void sendMessage(String msg, User user);

    void addUser(User user);

}
