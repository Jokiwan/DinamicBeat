package test1;

import java.util.Scanner;

public class Switch_test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("level�� �Է��ϼ���...manager, member, guest");
		String level = sc.next();

		switch (level) {
		case "manager":
			System.out.println("����� "+level+"�̹Ƿ�, ��� �����մϴ�.");
			break;
		case "member":
			System.out.println("����� "+level+"�̹Ƿ�, �۾��Ⱑ �����մϴ�.");
			break;
		case "guest":
			System.out.println("����� "+level+"�̹Ƿ�, �Խ��� ���Ⱑ �����մϴ�.");
			break;
		default:
			System.out.println("��Ȯ�� �Է��ϼ���.");
		}

	}

}
