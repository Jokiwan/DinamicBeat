package test1;

import java.util.Scanner;

public class Test_for {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum=0;
		for(int i=1; i<=5; i++) {
		System.out.println("���� 5���� �Է��Ͻÿ�.");
	
		int data1 = sc.nextInt();
		sum=sum+data1;
	}
		double ave = sum / 5;

		
		System.out.println("�հ�� " + sum);
		System.out.println("����� " + ave);
		

	}
	
}
		   

// i=1		sum = 0+1
// i=2		sum = (0+1)+2
// i=3  	sum = (0+1+2)+3	