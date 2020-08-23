package com.logics;

import java.text.DecimalFormat;

public class EnglishWords {

	private static final String[] numNames = { " ", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };
	private static final String[] tensNames = { " ", "ten", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninety" };

	public static String convert(int num) {
		String convert = "";
		if (num % 100 < 20) {
			convert = numNames[num % 100];
			num /= 100;
		}
		else {
			convert = numNames[num % 10];
			num /= 10;

			convert = tensNames[num % 10]+" "+convert;
			num /= 10;
		}
		if (num == 0) {
			return convert;
		}
		return numNames[num] + " hundred " + convert;
	}

	public static void main(String[] args) {
		long num = 111155;

		String mask = "000000000000";
		String number = Long.toString(num);

		DecimalFormat df = new DecimalFormat(mask);
		number = df.format(num);

		System.out.println(number);
		int hundredThousand = Integer.parseInt(number.substring(6, 9));
		int thousand = Integer.parseInt(number.substring(9, 12));
		String result = "";
		switch (hundredThousand) {
			case 0:
				result = " ";
				break;
			case 1:
				result = "one thousand";
				break;
			default:
				result = convert(hundredThousand) + " thousand ";
				break;
		}
		System.out.println(result + convert(thousand));

	}

}
