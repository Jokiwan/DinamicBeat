package test1;

import java.util.Scanner;

public class Switch_test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("level을 입력하세요...manager, member, guest");
		String level = sc.next();

		switch (level) {
		case "manager":
			System.out.println("당신은 "+level+"이므로, 운영이 가능합니다.");
			break;
		case "member":
			System.out.println("당신은 "+level+"이므로, 글쓰기가 가능합니다.");
			break;
		case "guest":
			System.out.println("당신은 "+level+"이므로, 게시판 보기가 가능합니다.");
			break;
		default:
			System.out.println("정확히 입력하세요.");
		}

	}

}
