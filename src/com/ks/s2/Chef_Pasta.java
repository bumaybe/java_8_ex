package com.ks.s2;

public class Chef_Pasta {
	
	//메서드명은 makePasta
	//1.크림파스타 15000, 2번소스
	//2.로제파스타 20000, 1번소스
	//3.알리오올리오 30000, 1번
	public Food_Pasta makePasta(int select) {
		Food_source s = new Food_source();
		Food_Pasta p = new Food_Pasta();
		Chef_Source cs = new Chef_Source();
		switch(select) {
		case 1:
			p.name = "크림파스타";
			p.price = 15000;
			p.source = cs.makeSource(2);
			break;
		case 2:
			p.name = "로제파스타";
			p.price = 20000;
			p.source = cs.makeSource(1);
			break;
		case 3:
			p.name = "알리오올리오";
			p.price = 30000;
			p.source = cs.makeSource(1);
			break;
		default:
			System.out.println("1,2,3중에 다시선택하세요");
		}
		
		return p;
	}
}
