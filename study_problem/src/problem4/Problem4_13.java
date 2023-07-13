package problem4;

public class Problem4_13 {

	public static void main(String[] args) {

		int a = (int)(Math.random()*10)+1;
		System.out.println("発生した数値: " + a);

		for (int i=1; i<=a; i++) {
			if(a>=5) {
				System.out.print("★");
			}
		}
	}
}
