package iip.nju.edu.cn.Bridge;

public class MysqlDriver implements Driver{

	@Override
	public Connection connect(String database, String name, String passwd) {
		System.out.println("���ݿ�"+database+"������");
		return null;
	}

}
