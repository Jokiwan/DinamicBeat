package test1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class 로또 {

	public static void main(String[] args) {
	
		  List<Integer> list = new ArrayList<Integer>();
	        //리스트에 1~45 정수 추카
	        for (int i = 0; i < 45; i++) {
	            list.add(i + 1);
	        }
	        //List를 Radom하게 섞는다.
	        Collections.shuffle(list);
	        //random하게 섞였으므로, 임의 6개의 index에서 숫자를 뽑는다.
	        for (int i = 0; i < 6; i++) {
	            System.out.println("<" + list.get(i) + ">");
	        }
	    }
	}
	
		

		
	





