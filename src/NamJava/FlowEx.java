package NamJava;

import java.io.IOException;

public class FlowEx {

	public static void main(String[] args) throws IOException {
		int input = 0;

		System.out.println("������ �Է��Ͻÿ�.");
		System.out.println("�Է��� ��ġ����    x�� �Է��ϼ���.");

		do {
			input = System.in.read(); 
			System.out.print((char) input);

		} while (input!= -1 && input != 'x');

	}

}
