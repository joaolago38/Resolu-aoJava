package tutorials.jenkov.com.java.math;

public class Division {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int division1 = 100 / 10;
		int division2 = division1 / 2;
		int division3 = division1 / division2;
		System.out.println("division1 :" + division1);
		System.out.println("division2 :" + division2);
		System.out.println("division3 :" + division3);

		// maneira dois
		int division = 100 / 10 / 2;
		System.out.println("division :" + division);
		
		int result = 100;
		result = result / 5;
		System.out.println("result :" + result);

	}

}
