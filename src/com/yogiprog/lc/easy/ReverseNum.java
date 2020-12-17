package com.yogiprog.lc.easy;

public class ReverseNum {

	public int reverse(int x) {

		int temp = 0;
		boolean isNegative = false;
		if (x < 0) {
			x = x * (-1);
			isNegative = true;
		}

		while (x > 0) {

			System.out.println(x % 10);
			temp = temp * 10;
			temp = temp + x % 10;
			x = x / 10;
		}

		if (isNegative)
			temp = temp * (-1);

		System.out.println(temp);
		return temp;

	}

	public static void main(String[] args) {

		ReverseNum rn = new ReverseNum();
		rn.reverse(1534236469);
		
	}

}
