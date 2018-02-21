package com.ks.s2;

import java.util.Scanner;

public class Food_Main {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		/*System.out.println("번호선택");
		int a = sc.nextInt();*/
		/*System.out.println("소스번호선택(1,2)");
		int b = sc.nextInt();*/
		Chef_Pasta pasta2 = new Chef_Pasta();
		
		Chef_Steak steak2 =new Chef_Steak();
/*		Food_Steak steak = steak2.makeSteak(a);
		Food_Pasta pasta = pasta2.makePasta(a);*/ 
		
//		Food_source source = s.makeSource(a);
		//source가 null인지 아닌지 확인
		
		new Menu().order();
		/*if(source != null) {
			System.out.println(source.oilName);
			System.out.println(source.spiceName);
		}*/
		
		/*if(steak2 != null) {
			System.out.println(steak.name);
			System.out.println(steak.price);
			System.out.println(steak.source.oilName);
			System.out.println(steak.source.spiceName); 
		}
*/
	/*	System.out.println(pasta.name);
		System.out.println(pasta.price);
		System.out.println(pasta.source.oilName);
		System.out.println(pasta.source.spiceName);
*/





		/*Food_Pasta pasta = new Food_Pasta();
		pasta.name = "크림파스타";
		pasta.price = 20000;

		System.out.println(pasta.source);// null(선언 x)

		pasta.source = new Food_source();



		pasta.source.oilName = "olive";
		pasta.source.spiceName = "hub";

		Food_Pasta pasta2 = new Food_Pasta();
		System.out.println(pasta2.source.oilName);


		for(int i = 0; i<2; i++) {
		Food_Steak steak = new Food_Steak();
		steak.name = "안심스테이크";
		steak.price = 40000;
		}*/


		/*pasta.name = steak.name;
		pasta.price = steak.price;*/ //멤버변수의 타입은 다 같다


		//소스 : 오일, 향신료

	}

}
