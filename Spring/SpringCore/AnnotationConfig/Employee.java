package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("emp")		//Employee emp = new Employee();
public class Employee {  //pojo
	
	private String empName ;
	
	private int empId;
	
	@Autowired
	private Address empAdd;
	
	private int empSal;
	
	public Employee() {
		
	}

	
	
	public String getEmpName() {
		return empName;
	}



	public void setEmpName(String empName) {
		this.empName = empName;
	}



	public int getEmpId() {
		return empId;
	}



	public void setEmpId(int empId) {
		this.empId = empId;
	}



	public Address getEmpAdd() {
		return empAdd;
	}



	public void setEmpAdd(Address empAdd) {
		this.empAdd = empAdd;
	}



	public int getEmpSal() {
		return empSal;
	}



	public void setEmpSal(int empSal) {
		this.empSal = empSal;
	}



	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empId=" + empId + ", empAdd=" + empAdd + ", empSal=" + empSal + "]";
	}


	public Employee(String empName, int empId, Address empAdd, int empSal) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.empAdd = empAdd;
		this.empSal = empSal;
	}
	
	

}
