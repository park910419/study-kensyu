package problem4;

public class Problem4_16 {

	public static void main(String[] args) {

		for(int i=1; i<=9; i++) {
			for(int j=1; j<=9; j++) {

				int result = i*j;
				System.out.print(i+"*"+j+"="+result+" ");

			}
			System.out.println();
		}
	}
}
