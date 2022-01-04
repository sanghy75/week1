package week1.day1;

public class SumOfDigits {

	public static void main(String[] args) {
		int N = 1234;
		int Q, R, sum = 0;

		while (N != 0) {
			Q = N / 10;
			R = N % 10;
			sum = sum + R;
			N = Q;

		}
		System.out.println(sum);
	}

}
