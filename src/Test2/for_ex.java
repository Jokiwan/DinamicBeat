package Test2;

import java.util.Scanner;

public class for_ex {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int sum =0;
		double ave = 0;
		for (int i = 1; i <=3; i++) {
			System.out.println("���� 3���� �Է��ϼ���.");
			int data1 = sc.nextInt();
			
			sum += data1;
			
			
		}
			ave = sum/3.0;
		
			System.out.println("�հ�� = " + sum);
			System.out.println("����� = " + ave);
		}

}

