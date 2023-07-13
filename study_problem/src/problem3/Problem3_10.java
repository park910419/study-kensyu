package problem3;

public class Problem3_10 {

	public static void main(String[] args) {

		int a = (int)(Math.random()*100)+1;
		System.out.println("a : "+a);

		if (a <=10 && a >= 90) {
			System.out.println("10以下か90以上の値ですん");
		} else
			System.out.println("10より大きく90未満です");

	}

}
