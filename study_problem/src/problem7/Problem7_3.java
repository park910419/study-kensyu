package problem7;

public class Problem7_3 {

	public static void main(String[] args) {

		Calculation c = new Calculation();

		c.setNum1(8);
		c.setNum2(9);

		System.out.println(c.getNum1()+"+"+c.getNum2()+"="+c.add());
		System.out.println(c.getNum1()+"-"+c.getNum2()+"="+c.sub());
	}

}