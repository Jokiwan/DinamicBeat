package test1;

import java.util.Scanner;

public class Test_dd {

	public static void main(String[] args) {
		// 1�� ���Ϻ��� 12�� ���ϱ���
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է�");
		int mon = sc.nextInt();

		switch (mon) {
		case 1 : 
		System.out.println(mon+"���� 31���Դϴ�.");
		break;
		case 2 : 
			System.out.println(mon+"���� 28���Դϴ�.");
			break;
		case 3 : 
			System.out.println(mon+"���� 31���Դϴ�.");
			break;
		case 4 : 
			System.out.println(mon+"���� 30���Դϴ�.");
			break;
		case 5 : 
			System.out.println(mon+"���� 31���Դϴ�.");
			break;
		case 6 : 
			System.out.println(mon+"���� 30���Դϴ�.");
			break;
		case 7 : 
			System.out.println(mon+"���� 31���Դϴ�.");
			break;
		case 8 : 
			System.out.println(mon+"���� 31���Դϴ�.");
			break;
		case 9 : 
			System.out.println(mon+"���� 30���Դϴ�.");
			break;
		case 10 : 
			System.out.println(mon+"���� 31���Դϴ�.");
			break;
		case 11 : 
			System.out.println(mon+"���� 30���Դϴ�.");
			break;
		case 12 : 
			System.out.println(mon+"���� 31���Դϴ�.");
			break;
			default:
				System.out.println("�ܵ� �Է��ض�");
				break;
			
		

		}

	}

}
