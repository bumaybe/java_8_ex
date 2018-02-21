package com.ks.s2;

public class Chef_Steak {

	public Food_Steak makeSteak(int select) {
		
		//1.안심스테이크,30000원,1번소스
		//2.등심스테이크,40000원,2번소스
		//3.립스테이크,50000원,1번소스

		
		Food_Steak steak = new Food_Steak();
		Food_source source = new Food_source();
		Chef_Source so = new Chef_Source();
		switch(select) {
		
		case 1:
			steak.name ="안심스테이크";
			steak.price = 30000;
			steak.source = so.makeSource(1);
			break;
		case 2:
			steak.name ="등심스테이크";
			steak.price = 40000;
			steak.source = so.makeSource(2);
			break;
		case 3:
			steak.name ="립스테이크";
			steak.price = 50000;
			steak.source = so.makeSource(1);
			break;
		default:
			System.out.println("번호선택이 잘못됨");
		}
		
		/*Chef_Source s= new Chef_Source();
		
		Food_Steak steak = new Food_Steak();
		steak.name ="";
		steak.price = 10000 ;
		steak.source = s.makeSource(1);
		*/
		return steak;
	}
}
