package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int firstnum = 0;
		int secondnum = 1;
		System.out.println(firstnum);
		for (int i = 1; i <= 8; i++) {
			int sum = firstnum + secondnum;
			System.out.println(sum);
			firstnum = secondnum;
			secondnum = sum;
		}
	}
}
