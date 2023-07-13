package problem4;

public class Problem4_11 {

	public static void main(String[] args) {

		int maxNum = 0;

		for(int i=1; i<=5; i++) {
			int a = (int)(Math.random()*100)+1;
			System.out.println("乱数: " + a);

			if(a>maxNum) {
				maxNum = a;
			}
		}
		 System.out.println("最大値: " + maxNum);
	}
}
