package iip.nju.edu.cn.Adapter.ObjectAdapter;

public class Test {

	public static void main(String[] args) {
		Target t = new Adapter(new Adaptee());
        t.request();
	}

}
