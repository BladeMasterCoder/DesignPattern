package iip.nju.edu.cn.Bridge;

public class OracleDriver implements Driver{

	@Override
	public Connection connect(String database, String name, String passwd) {
		System.out.println("���ݿ�"+database+"������");
		return null;
	}

}
