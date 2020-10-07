package test1;

import java.util.Scanner;

public class Test8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력하세요.");
		
		int age = sc.nextInt(); 
		
		System.out.println("나의 나이는 "+ age +"살 입니다.");
		
		
		String enter = (age >= 15)? "입장가능" : "입장불가";
		System.out.println(enter+"입니다.");
		
		

	}

}
