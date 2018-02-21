package com.ks.s3;

public class Point {

	
	//메서드 오버로딩(메서드 이름을 중복선언)
	//메서드의 이름은 같아야함(메서드 오버로딩 조건)
	//단,매개변수의 타입 또는 갯수가 달라야한다(***** 중요)
	//접근지정자,리턴타입은 상관X
	
	public void hap(int a, int b) {
		System.out.println(a+b);
	}
	
	public void hap(int a, float b) {
		System.out.println(a+b);
	}
	
	public void hap(float a, float b) {
		System.out.println(a+b);
	}
	
	
}
