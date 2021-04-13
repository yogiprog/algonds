package com.yogiprog.lc.easy;

public class HappyNumber {

	/**
	 * @param num
	 * @return
	 */
	static boolean isHappyNumber(int num) {

		
			int temp =0;
			while (num != 0) {
				temp = temp + (num % 10) * (num % 10);
				System.out.println(">>>>temp" + temp);
				num = num / 10;
			}
			num = temp;
		
		while (num / 10 != 0) {
			int sum = 0;
			while (num != 0) {
				sum = sum + (num % 10) * (num % 10);
				System.out.println(">>>>" + sum);
				num = num / 10;
			}
			num = sum;
		}
		return num == 1 ? true : false;
	}

	public static void main(String[] args) {

		System.out.println(HappyNumber.isHappyNumber(7));
	}

}
