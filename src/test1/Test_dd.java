package test1;

import java.util.Scanner;

public class Test_dd {

	public static void main(String[] args) {
		// 1월 말일부터 12월 말일까지
		Scanner sc = new Scanner(System.in);
		System.out.println("달을 입력");
		int mon = sc.nextInt();

		switch (mon) {
		case 1 : 
		System.out.println(mon+"월은 31일입니다.");
		break;
		case 2 : 
			System.out.println(mon+"월은 28일입니다.");
			break;
		case 3 : 
			System.out.println(mon+"월은 31일입니다.");
			break;
		case 4 : 
			System.out.println(mon+"월은 30일입니다.");
			break;
		case 5 : 
			System.out.println(mon+"월은 31일입니다.");
			break;
		case 6 : 
			System.out.println(mon+"월은 30일입니다.");
			break;
		case 7 : 
			System.out.println(mon+"월은 31일입니다.");
			break;
		case 8 : 
			System.out.println(mon+"월은 31일입니다.");
			break;
		case 9 : 
			System.out.println(mon+"월은 30일입니다.");
			break;
		case 10 : 
			System.out.println(mon+"월은 31일입니다.");
			break;
		case 11 : 
			System.out.println(mon+"월은 30일입니다.");
			break;
		case 12 : 
			System.out.println(mon+"월은 31일입니다.");
			break;
			default:
				System.out.println("단디 입력해라");
				break;
			
		

		}

	}

}
