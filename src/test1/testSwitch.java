package test1;

import java.util.Scanner;

public class testSwitch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("계절을 입력하세요");
		String season = sc.next();
		
		switch(season) {
		
		case "spring":System.out.println("따뜻");
			break;
		case "winter":System.out.println("추워");
			break;
		case "summer":System.out.println("더워");
			break;
		case "fall":System.out.println("쌀쌀");
			break;
			default: System.out.println("다시 입력하시오.");
		}

	}

}
