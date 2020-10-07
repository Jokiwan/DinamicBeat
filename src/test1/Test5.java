package test1;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		
		final double PI = 3.141592; //상수의 선언 final사용, 대문자사용
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("원의 반지름을 입력하시오.");
		
		int radius = sc.nextInt();
		
		double area = radius*radius*PI;
		
		System.out.println("원의 면적 : ");
		System.out.println(area);
		
		

	}

}
