package iip.nju.edu.cn.Bridge;

public class Test {
	public static void main(String[] args){
		Driver mysqlDriver = new MysqlDriver();
		DriverManger.setDriver(mysqlDriver);
		Connection con1 = DriverManger.getConnection("mysql", "iip", "123456");
		
		Driver oracleDriver = new OracleDriver();
		DriverManger.setDriver(oracleDriver);
		Connection con2 = DriverManger.getConnection("oracle", "iip", "123456");

	}
}
