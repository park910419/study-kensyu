package problem4;

public class Problem4_17 {

	public static void main(String[] args) {

		int n = 10;

		for(int i=0; i<n; i++) {

			for(int j=0; j<n; j++) {

				if(j<=i) {
					System.out.print("■ ");
				} else {
					System.out.print("□ ");
				}

			}

			System.out.println(" ");
		}
	}
}