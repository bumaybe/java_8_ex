package com.ks.s3;

public class Car {

	String color;
	String brand;
	int cc;
	
	public Car() { //기본생성자(default 생성자)
		//default,기본,빈 생성자
		
/*		color = "Red";
		brand = "Audi";
		cc = 3000;*/
		this("Benz");//자신의 또다른 생성자를 호출, 이경우에는 바로 밑에 생성자 호출
		//생성자라인의 첫줄에 기술해야한다(this위에 sysout등이 있으면 바로 에러뜬다)
		}
	
	public Car(String brand) { //매개변수 이름은 상관없이 타입과 갯수가 달라야한다.
	/*	color = "White";
		this.brand = brand; // this = 만들어진 객체의 주소값이 들어간 변수,객체 안에서만 쓸수 있다
		//this : 다른애들과 멤버변수 구분할때 사용
		cc = 3000;*/
		this("GRAY",brand);
	}
	
	public Car(String color, String brand) {
		/*color= c;
		brand = b;
		cc = 3000;*/
		this(color,brand,5000);
	}
	
	public Car(String color, String brand, int cc) {
		this.color = color;
		this.brand = brand;
		this.cc = cc;
	}
	//나머지 3개는 디폴트 생성자가 아니다
	//멤버변수의 색깔은 파란색
	//참조변수의 자기자신을 나타내는 변수 this
	public void info() {
		System.out.println("Color :" + this.color);
		System.out.println("Brand :" + this.brand);
		System.out.println("CC :" + this.cc);
		this.make();
	}
	
	public void make() {
		System.out.println("자동차 제작완료");
	}
}
