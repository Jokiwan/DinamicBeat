package test1;

import java.util.Scanner;

public class Test_for {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum=0;
		for(int i=1; i<=5; i++) {
		System.out.println("정수 5개를 입력하시오.");
	
		int data1 = sc.nextInt();
		sum=sum+data1;
	}
		double ave = sum / 5;

		
		System.out.println("합계는 " + sum);
		System.out.println("평균은 " + ave);
		

	}
	
}
		   

// i=1		sum = 0+1
// i=2		sum = (0+1)+2
// i=3  	sum = (0+1+2)+3	