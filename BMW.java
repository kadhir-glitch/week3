package week3day3;

import bank.RBI;
import week3day2.Car1;

public class BMW extends Car1 implements RBI {

	// Inheritance is ( acquiring properties parent to child )
	public void speedOmeter() {
		System.out.println("speedOmeter");

	}

	public void autoDrive() {
		System.out.println("autoDrive");

	}

	public void logo() {
		System.out.println("logo");

	}

	public void lowpercentLoan() {
		System.out.println("lowpercentLoan");

	}

	public void noCostEmi() {
		System.out.println("noCostEmi");
	}

	public void vehicleLoan() {
		System.out.println("vehicleLoan");

	}

	public static  void main(String[] args) {
		 		
		BMW obj = new BMW();
		obj.applyTyre();
		obj.autoDrive();
		obj.logo();
		obj.lowpercentLoan();
		obj.noCostEmi();
		obj.speedOmeter();
		obj.vehicleLoan();

	}

}
