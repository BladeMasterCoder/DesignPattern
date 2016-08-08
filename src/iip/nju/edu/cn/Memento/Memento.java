package iip.nju.edu.cn.Memento;

public class Memento {
	
	private String value;

	public Memento(Original original) {
		this.value = original.getValue();
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}