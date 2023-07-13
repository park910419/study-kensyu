package problem3;

public class Problem3_13 {

	public static void main(String[] args) {

		int a = (int)(Math.random()*3)+1;
		System.out.println("a : "+a);

		if (a == 1) {
			System.out.println("グー");
		} else if (a == 2) {
			System.out.println("パー");
		} else if (a == 3) {
			System.out.println("チョキ");
		}
	}

}
