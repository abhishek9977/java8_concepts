package com.mycompany.functionalinterface;

import java.util.Scanner;

public class CalculatorMain {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value for num1:");
		Double a = sc.nextDouble();
		System.out.println("Enter a value for num2:");
		Double b = sc.nextDouble();
		sc.nextLine();
		System.out.println("Enter:--1.add--2.sub--3.mul--4.div--");
		String d = sc.next();

		Double res = null;
		Calculator c = null;
		switch (d) {
		case "1":
			c = (Double num11, Double num22) -> {
				return num11 + num22;
			};
			res = c.cal(a, b);

			break;

		case "2":
			c = (Double num11, Double num22) -> {
				return num11 - num22;
			};
			res = c.cal(a, b);

			break;
		case "3":
			c = (Double num11, Double num22) -> {
				return num11 * num22;
			};
			res = c.cal(a, b);

			break;
		case "4":
			c = (Double num11, Double num22) -> {
				return num11 / num22;
			};
			res = c.cal(a, b);

			break;
		default:
			System.out.println("incorrect choice");
			break;
		}
		System.out.println("result:" + res);
	}
}
