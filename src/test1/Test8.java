package test1;

import java.util.Scanner;

public class Test8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("���̸� �Է��ϼ���.");
		
		int age = sc.nextInt(); 
		
		System.out.println("���� ���̴� "+ age +"�� �Դϴ�.");
		
		
		String enter = (age >= 15)? "���尡��" : "����Ұ�";
		System.out.println(enter+"�Դϴ�.");
		
		

	}

}
