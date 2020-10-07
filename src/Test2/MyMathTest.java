package Test2;


public class MyMathTest {

	public static void main(String[] args) {
		MyMath mm = new MyMath();
		long result1 = mm.add(5L, 3L);
		long result2 = mm.subtract(5L, 3L);
		long result3 = mm.multiply(5L, 3L);
		float result4 = mm.divide(5L, 3L);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
	}

}


class MyMath {
	long add(long a, long b) {
		long result = a+b;
		return result;
		}
	long subtract(long a, long b) {
		long subtract = a-b;
		return subtract;
		}
	long multiply(long a, long b) {
		long multiply = a*b;
		return multiply;
	}
	float divide(long a, long b) {
		float divide = (float) a/b;
		return divide;
	}
	
	
}