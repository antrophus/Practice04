package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {

	/*
	 * Ex07 키보드에서 정수로 된 돈의 액수를 입력받아 50000원권, 10000원권, 5000원권, 1000원권, 500원 동전, 100원
	 * 동전, 50원동전, 1원동전 각 몇 개로 변환 되는지 작성 하세요. (아래의 배열을 사용하여 코딩하세요.)
	 * 
	 * int[] wonArray = new int[10]; wonArray[0] = 50000; wonArray[1] = 10000;
	 * wonArray[2] = 5000; wonArray[3] = 1000; wonArray[4] = 500; wonArray[5] = 100;
	 * wonArray[6] = 50; wonArray[7] = 10; wonArray[8] = 5; wonArray[9] = 1;
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] wonArray = new int[10];
		wonArray[0] = 50000;
		wonArray[1] = 10000;
		wonArray[2] = 5000;
		wonArray[3] = 1000;
		wonArray[4] = 500;
		wonArray[5] = 100;
		wonArray[6] = 50;
		wonArray[7] = 10;
		wonArray[8] = 5;
		wonArray[9] = 1;

		System.out.println("금액: ");
		int price = sc.nextInt();

		int a = price / wonArray[0];
		int b = (price % wonArray[0])/ wonArray[1];
		int c = (price % wonArray[1])/ wonArray[2];
		int d = (price % wonArray[2])/ wonArray[3];
		int e = (price % wonArray[3])/ wonArray[4];
		int f = (price % wonArray[4])/ wonArray[5];
		int g = (price % wonArray[5])/ wonArray[6];
		int h = (price % wonArray[6])/ wonArray[7];
		int i = (price % wonArray[7])/ wonArray[8];
		int j = (price % wonArray[8])/ wonArray[9];
		
		System.out.println("50000원:" + a + "개");
		System.out.println("10000원:" + b + "개");
		System.out.println("5000원:" + c + "개");
		System.out.println("1000원:" + d + "개");
		System.out.println("500원:" + e + "개");
		System.out.println("100원:" + f + "개");
		System.out.println("50원:" + g + "개");
		System.out.println("10원:" + h + "개");
		System.out.println("5원:" + i + "개");
		System.out.println("1원:" + j + "개");
		sc.close();
	}
}
