package test1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class �ζ� {

	public static void main(String[] args) {
	
		  List<Integer> list = new ArrayList<Integer>();
	        //����Ʈ�� 1~45 ���� ��ī
	        for (int i = 0; i < 45; i++) {
	            list.add(i + 1);
	        }
	        //List�� Radom�ϰ� ���´�.
	        Collections.shuffle(list);
	        //random�ϰ� �������Ƿ�, ���� 6���� index���� ���ڸ� �̴´�.
	        for (int i = 0; i < 6; i++) {
	            System.out.println("<" + list.get(i) + ">");
	        }
	    }
	}
	
		

		
	





