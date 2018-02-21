package com.ks.s3;

public class CarMain {

	public static void main(String[] args) {
/*		Car c = new Car();
		c.color = "Yellow";
		c.brand ="Audi";
		c.cc = 3000;

		c.info();
		*/
		Car c2 = new Car("Audi");
		c2.info();
		
		Car c3 = new Car("BLACK","Benz");
		c3.info();
		c2.make();
	}
	

}
