package test1;

import java.util.Scanner;

public class Test_if {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요...");

		int score = sc.nextInt();

		if (score >= 90 & score <=100 ) {
			System.out.println("당신의 점수는 " + score + "이고, 등급은 A입니다.");
		} else if (score <=89) {
			System.out.println("당신의 점수는 " + score + "이고, 등급은B입니다.");
		} else if (score <=79) {
			System.out.println("당신의 점수는 " + score + "이고, 등급은C입니다.");
		} else if (score <=69) {
			System.out.println("당신의 점수는 " + score + "이고, 등급은D입니다.");
		} else if (score <=59) {
			System.out.println("당신의 점수는 " + score + "이고, 등급은F입니다.");
		} else {
			System.out.println("똑바로 입력해라 문디야~~~!!!");
		}

	}

}
