package problem4;

public class Problem4_2 {

	public static void main(String[] args) {

		int a = (int)(Math.random()*10)+1;
		System.out.println("乱数: " + a);

		int i = 1;

		while (i<=a) {
			i++;
			System.out.print("■ ");
		}
	}
}
