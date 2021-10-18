package com.app.core;

import java.util.StringTokenizer;

public class StringCalculator {

	public static int Add(String str) {

		int sum = 0;
		String arr[] = str.split("[ , \n : ; // \\/ | . * %]+");

		for (int i = 0; i < arr.length; i++) {
			int num = Integer.parseInt(arr[i]);
			if (num <0) {
				System.out.println("negative number not allowed");
				return 0;
			}
			else if(num>=1000) {
				continue;
			}
			sum += num;
		}
		return sum;
	}
		public static int Add(String str, String delimeter) {
			StringTokenizer st = new StringTokenizer(str, delimeter);
			int sum = 0;
			int number =0;
			while(st.hasMoreTokens()) {
				number = Integer.parseInt(st.nextToken());
				sum += number;
			}
			
		

		return sum;
	}

}
