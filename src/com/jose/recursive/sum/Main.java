package com.jose.recursive.sum;

import java.util.Scanner;

public class Main {

	final static Scanner in = new Scanner(System.in);

	public static void main(String args[]) {

		final int number = in.nextInt();
		System.out.print(sum(number));
	}

	private static int sum(final int number) {
		if (number == 0) {
			return 0;
		}

		return sum(number - 1) + number;
	}
}
