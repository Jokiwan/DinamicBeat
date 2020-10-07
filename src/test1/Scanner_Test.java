package test1;

import java.util.Scanner;

public class Scanner_Test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
	
		int sum = 0;
		int mn = 5;
		for(int i=1; i<=5; i++) {
			System.out.println("숫자를 "+(mn--)+"번 입력하시오...");
			int inp = sc.nextInt();			
			sum+=inp;
			
		}
			System.out.println("총합"+sum+ "이고, 평균은 "+ sum/5.0 + " 입니다.");
		      
		

	}

}
