package Test2;

import java.util.Scanner;

public class Test_1_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ar[] = new int[5];
		int max = ar[0];

//		       �Է¹�
		for (int i = 0; i < ar.length; i++) {
			System.out.println("���ڸ� 5�� �Է��Ͻÿ�.");
			ar[i] = sc.nextInt();

		}
//			��¹�	
		for (int i = 1; i < ar.length; i++) {
			System.out.println(ar[i]);
			if (max < ar[i]) {
				max = ar[i];
			}

//				max = (max > ar[i])? max : ar[i];
		}
		System.out.println("�ְ��� " + max + "�Դϴ�");

		int min = ar[0];
		for (int i = 1; i < ar.length; i++) {
			if (min > ar[i]) {
				min = ar[i];
			}

		}

		System.out.println("�������� " + min);

	}

}
