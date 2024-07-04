package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {
	
	/*Ex05 5개의 숫자를 키보드로 입력받아 평균을 구하는 프로그램을 작성하세요. */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//		
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
//		int num3 = sc.nextInt();
//		int num4 = sc.nextInt();
//		int num5 = sc.nextInt();
//		double avg = (double)(num1 + num2 + num3 + num4 + num5)/5;
//		System.out.println("평균은 " + avg + " 입니다." );
//		sc.close();	
		
		int[] dataArray = new int[5];
		int num;
		double sum = 0;

		// 키보드에서 배열 크기만큼 입력 받아 배열에 저장하는 코드
		for (int i = 0; i < dataArray.length; i++) {
			num = sc.nextInt();
			dataArray[i] = num;
		}

		// 배열에 저장된 정수 값 더하기
		for (int i = 0; i < dataArray.length; i++) {
			sum = sum + dataArray[i];
		}

		// 평균값 출력
		System.out.println("평균은 " + sum / dataArray.length + " 입니다.");

		sc.close();
	}

}
