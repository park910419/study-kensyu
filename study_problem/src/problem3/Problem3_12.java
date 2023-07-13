package problem3;

public class Problem3_12 {

	public static void main(String[] args) {

		int a = (int)(Math.random()*21)-10;
		System.out.println("a : "+a);

		if (a < 0) {
			System.out.println("負の値です");
		} else if ( a > 0) {
			System.out.println("正の値です");
		} else System.out.println("0です");
	}

}
