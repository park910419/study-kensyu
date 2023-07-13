package problem4;

public class Problem4_9 {

	public static void main(String[] args) {

		while (true) {
			int a = (int)(Math.random()*100)+1;
			System.out.println("乱数: "+a);

			if(a%10==0) {
				System.out.println("end");
				break;
			}
		}
	}
}
