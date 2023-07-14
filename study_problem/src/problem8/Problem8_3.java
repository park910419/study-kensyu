package problem8;

import java.util.Scanner;

public class Problem8_3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("임의의 숫자를 입력하시오: ");

		int number = scanner.nextInt();
		int result = factorial(number);
		System.out.println(number + "의 계승은 " + result + "입니다.");

	}

	private static int factorial(int n) {
		if(n==0){
			return 1;
		} else {
			return n * factorial(n-1);
		}
	}

}
