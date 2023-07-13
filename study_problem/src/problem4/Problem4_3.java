package problem4;

public class Problem4_3 {

	public static void main(String[] args) {

		int a = (int)(Math.random()*10)+1;
		System.out.println("乱数: " + a);

		int i = 1;

		do {
			i++;
			}
		while (i<=a);

		System.out.print("■ ");
	}
}
