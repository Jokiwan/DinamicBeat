package test1;

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("�ð����� ������ �ʸ� �Է��Ͻÿ�.");
		int sec = sc.nextInt();

		int hour = sec / 3600; //
		int min = (sec % 3600) / 60;
		int seccond = sec % 3600 % 60;

		System.out.println("��  " + hour + "�ð�  " + min + "��  " + seccond + "�� �Դϴ�.");

		/*
		 * System.out.print(hour); 
		 * System.out.print("�ð� "); 
		 * System.out.print(min);
		 * System.out.print("�� "); 
		 * System.out.print(seccond); 
		 * System.out.println("�� ");
		 */
		
	}

}
