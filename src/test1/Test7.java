package test1;

import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �׼��� �Է��Ͻÿ�...��~~~~");
		int money = sc.nextInt();
		
		int oman = money / 50000;
		int ilman = (money % 50000) / 10000;
		int oChon = (money % 10000) / 5000;
		int ilchon = (money % 5000) /1000;
		int obac = (money % 1000)/ 500;
		int ilbac = (money % 500)/ 100;
		int osib = (money % 100)/ 50;
		int ilsib = (money % 50)/ 10;
		int owon = (money % 10)/ 5;
		int ilwon  = money % 5;
		
//		int oman = money / 50000;
//		money = money%50000;
//		int ilman = money / 10000;
//		money = money%10000;
		
		
				System.out.print("�ݾ��� �������� " + oman + "��, ������ " + ilman 
						+ "��, ��õ���� " + oChon + "��, õ���� " + ilchon + "��, ����� " + obac 
						+ "��, ��� " + ilbac + "��, ���ʿ� " +osib + "��, �ʿ� " + ilsib + "��, ���� " 
						+ owon + "��, �Ͽ� " + ilwon + "�� �Դϴ�...����� �Ф�");
		
				
				
				

	}

}
