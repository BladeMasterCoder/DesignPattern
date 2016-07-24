package iip.nju.edu.cn.Bridge;

public interface Driver {
	public abstract Connection connect(String database, String name,String passwd);
}
