package org.emp;
//  inheritance
public class Client extends Employee{
	public void clName() {
		System.out.println("Hcl");
	}
	public static void main(String[] args) {
		Client c = new Client();
//		c.compName();
		c.empName();
		c.clName();
		Company cp = new Company();
		cp.empName();
		cp.compName();
}
}
