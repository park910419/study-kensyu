package problem5;

import java.util.Random;

public class Problem5_1 {

	public static void main(String[] args) {

		int[] a = new int[7];

		Random ran = new Random();

		for(int i=0; i<a.length; i++) {
			a[i]=ran.nextInt(10)+1;
		}

		for(int i=0; i<a.length; i++) {
			System.out.println("a["+i+"]="+a[i]+" ");
		}
	}
}
