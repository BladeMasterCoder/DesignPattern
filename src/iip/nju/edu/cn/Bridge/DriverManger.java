package iip.nju.edu.cn.Bridge;

public class DriverManger {
	
	private static Driver driver;
	
	public static Connection getConnection(String database, String name,String passwd){
		return DriverManger.driver.connect(database, name, passwd);
	}
	

	public static void setDriver(Driver driver) {
		DriverManger.driver = driver;
	}
}
