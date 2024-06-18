package demo;

import org.springframework.stereotype.Component;

@Component("add")
public class Address {

	private int hno;
	
	private String strName;
	
	private int pin;

	public int getHno() {
		return hno;
	}

	public void setHno(int hno) {
		this.hno = hno;
	}

	public String getStrName() {
		return strName;
	}

	public void setStrName(String strName) {
		this.strName = strName;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	@Override
	public String toString() {
		return "Address [hno=" + hno + ", strName=" + strName + ", pin=" + pin + "]";
	}
	
	
}
