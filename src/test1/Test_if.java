package test1;

import java.util.Scanner;

public class Test_if {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���...");

		int score = sc.nextInt();

		if (score >= 90 & score <=100 ) {
			System.out.println("����� ������ " + score + "�̰�, ����� A�Դϴ�.");
		} else if (score <=89) {
			System.out.println("����� ������ " + score + "�̰�, �����B�Դϴ�.");
		} else if (score <=79) {
			System.out.println("����� ������ " + score + "�̰�, �����C�Դϴ�.");
		} else if (score <=69) {
			System.out.println("����� ������ " + score + "�̰�, �����D�Դϴ�.");
		} else if (score <=59) {
			System.out.println("����� ������ " + score + "�̰�, �����F�Դϴ�.");
		} else {
			System.out.println("�ȹٷ� �Է��ض� �����~~~!!!");
		}

	}

}
