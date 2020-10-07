package test1;

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("시간으로 변경할 초를 입력하시오.");
		int sec = sc.nextInt();

		int hour = sec / 3600; //
		int min = (sec % 3600) / 60;
		int seccond = sec % 3600 % 60;

		System.out.println("총  " + hour + "시간  " + min + "분  " + seccond + "초 입니다.");

		/*
		 * System.out.print(hour); 
		 * System.out.print("시간 "); 
		 * System.out.print(min);
		 * System.out.print("분 "); 
		 * System.out.print(seccond); 
		 * System.out.println("초 ");
		 */
		
	}

}
