package test1;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���.");
		int data = sc.nextInt();
		
		
		if (data%3 == 0) {
			System.out.println("�Է°��� 3�ǹ���̴�.");
		} else {
			System.out.println("�Է°��� 3�� ����� �ƴմϴ�.");
		}
	}

}
