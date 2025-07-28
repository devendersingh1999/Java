package p1;

import java.util.concurrent.ForkJoinPool;

public class MyNumber {

	private int n;

	MyNumber(int n) {
		this.n = n;
	}

	public boolean isPrim() {

		if (n < 2) {

			return false;
		}
		for (int i = 2; i <= n - 1; i++) {

			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public void sumOfDivisors(int n) {

		int a = 0;
		for (int i = 2; i < n; i++) {

			if (n % i == 0) {

				a += i;

			}
		}
		System.out.println("sum of Divisor " + a);
	}

//	sum of number 
	public int sumUptoN() {

		int sum = 0;

		for (int i = 1; i <= n; i++) {

			sum += i;
		}
		return sum;

	}

	public void printANumberTriangle() {

		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= i; j++) {

				System.out.print(j);
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {

		MyNumber number = new MyNumber(5);

		System.out.println(number.isPrim());

		int sum = number.sumUptoN();

		number.sumOfDivisors(9);

		number.printANumberTriangle();

		System.out.println("sum of NUmber = " + sum);
	}
}
