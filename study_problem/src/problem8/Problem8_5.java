package problem8;

public class Problem8_5 {

	public static void main(String[] args) {

		System.out.println("3으로 나눌 수 있는 수:");
		for(int i=1; i<=100; i++) {
			if(i%3==0) {
				System.out.print(i+" ");
			}
		}

		System.out.println();
		System.out.println("3이 포함된 수:");
		for(int i=1; i<=100; i++) {
			if(three(i)) {
				System.out.print(i + " ");
			}
		}

	}

	private static boolean three(int number) {

		while(number != 0) {
			if(number % 10 == 3) {
				return true;
			}
			number /= 10;
		}
		return false;
	}
}
