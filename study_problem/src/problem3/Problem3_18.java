package problem3;

public class Problem3_18 {

	public static void main(String[] args) {

		int a = (int)(Math.random()*46)-10;
		System.out.println("摂氏"+a+"度");

		if (a >= 30) {
			System.out.println("真夏日です。");
		} else if (a >= 25 && a < 30) {
			System.out.println("夏日です。");
		} else if (a < 0) {
			System.out.println("真冬日です。");
		}

	}

}
