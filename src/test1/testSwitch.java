package test1;

import java.util.Scanner;

public class testSwitch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���");
		String season = sc.next();
		
		switch(season) {
		
		case "spring":System.out.println("����");
			break;
		case "winter":System.out.println("�߿�");
			break;
		case "summer":System.out.println("����");
			break;
		case "fall":System.out.println("�ҽ�");
			break;
			default: System.out.println("�ٽ� �Է��Ͻÿ�.");
		}

	}

}
