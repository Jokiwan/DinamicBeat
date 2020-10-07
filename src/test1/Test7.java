package test1;

import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("돈의 액수를 입력하시오...쫌~~~~");
		int money = sc.nextInt();
		
		int oman = money / 50000;
		int ilman = (money % 50000) / 10000;
		int oChon = (money % 10000) / 5000;
		int ilchon = (money % 5000) /1000;
		int obac = (money % 1000)/ 500;
		int ilbac = (money % 500)/ 100;
		int osib = (money % 100)/ 50;
		int ilsib = (money % 50)/ 10;
		int owon = (money % 10)/ 5;
		int ilwon  = money % 5;
		
//		int oman = money / 50000;
//		money = money%50000;
//		int ilman = money / 10000;
//		money = money%10000;
		
		
				System.out.print("금액은 오만원권 " + oman + "매, 만원권 " + ilman 
						+ "매, 오천원권 " + oChon + "매, 천원권 " + ilchon + "매, 오백원 " + obac 
						+ "개, 백원 " + ilbac + "개, 오십원 " +osib + "개, 십원 " + ilsib + "개, 오원 " 
						+ owon + "개, 일원 " + ilwon + "개 입니다...힘들다 ㅠㅠ");
		
				
				
				

	}

}
