package problem4;

public class Problem4_12 {

	public static void main(String[] args) {

		int minNum = Integer.MAX_VALUE;

		for(int i=1; i<=5; i++) {
			int a = (int)(Math.random()*100)+1;
			System.out.println("乱数: " + a);

			if(a<minNum) {
				minNum = a;
			}
		}
		 System.out.println("最小値: " + minNum);
	}
}
