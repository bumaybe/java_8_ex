package com.ks.s2;

public class Chef_Source {

	public Food_source makeSource(int select) { //메서드의 헤더,선언부
		/*Food_source source = new Food_source();
		source.oilName="olive";
		source.spiceName="hub";*/
		
		//oilName = "milk";
		//spiceName = "cheese";
		//1번 눌렀을때 위의 2개(올리브,허브) 2번눌렀을때 아래 2개
		Food_source s = new Food_source();
		switch(select) {
		case 1:
			//객체생성
			//Food_source s = new Food_source();
			s.oilName = "olive";
			s.spiceName = "hub";
			break;
		case 2:
			//Food_source s = new Food_source();
			s.oilName = "Milk";
			s.spiceName = "Cheese";
			break;
		
		default:
			System.out.println("번호 오류");
		}
		
		return s;
	}//{}:바디(본문)
}
