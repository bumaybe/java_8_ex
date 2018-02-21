package com.ks.s2;

import java.util.Scanner;

public class Menu {

	public void order() {
		Scanner sc = new Scanner(System.in);
		System.out.println("메뉴를 선택하시오");
		System.out.println("1.안심스테이크");
		System.out.println("2.등심스테이크");
		System.out.println("3.립스테이크");
		System.out.println("4.크림파스타");
		System.out.println("5.로제파스타");
		System.out.println("6.알리오올리오");

		int select = sc.nextInt();
		Food_Steak fs = new Food_Steak();//스테이크
		Food_Pasta fp = new Food_Pasta();//파스타
		Chef_Steak cs = new Chef_Steak();//스테이크 메뉴 선택
		Chef_Pasta cp = new Chef_Pasta();//파스타 메뉴 선택
		Bill bill = new Bill(); //Bill()은 메서드(특별한메서드)(생성자) (클래스X)
		if(select <= 3) {
			fs = cs.makeSteak(select);
			bill.billSteak(fs);
		}
		else {
			fp = cp.makePasta(select-3);
			bill.billPasta(fp);
		}
		
	}
}
