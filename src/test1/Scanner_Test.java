package test1;

import java.util.Scanner;

public class Scanner_Test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
	
		int sum = 0;
		int mn = 5;
		for(int i=1; i<=5; i++) {
			System.out.println("���ڸ� "+(mn--)+"�� �Է��Ͻÿ�...");
			int inp = sc.nextInt();			
			sum+=inp;
			
		}
			System.out.println("����"+sum+ "�̰�, ����� "+ sum/5.0 + " �Դϴ�.");
		      
		

	}

}
