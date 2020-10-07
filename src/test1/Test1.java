package test1;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count =100;  //변수선언
		count = (int)200.0; //명시적 형변환..강제로 실수를 정수로 변환
		System.out.println(count);
		//int count = 100; 변수 초기값(한번에 변수선언 및 값 입력)
		
		short data1 = 20;
		count = data1; //short(16bit)
		long longData = count;
		
		System.out.println(count);
		System.out.println(longData);
		
		double area;
		area = 0.0;
		//area = 100; 정수인데 사용 가능, 자동 형변환
		//float = 0.0F; float은 뒤에  F부착.
		
		char grade;
		grade = 'A';
		grade = (char)count; //명시적 형변환
		
		int c = 'B';
		
		
		
		System.out.println(c);
		
		
		boolean isEqual;
		isEqual = true; 
		
		
		
		int data2 = 100;
		int data3 = 200;
		int data4 = 50;
		
				
		
		int max = (data2>data3)?data2:data3;
		max = (max>data4)?max:data4;
		System.out.println(max);
		
		
		int min = (data2<data3)?data2:data3;
		min = (min<data4)?min:data4;
		System.out.println(min);
		
		int i = (int)40.2;
		System.out.println(i);
		
			
		
		
		
		
			 

	}

}
