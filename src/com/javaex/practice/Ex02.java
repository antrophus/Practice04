package com.javaex.practice;

public class Ex02 {
	
	/*Ex02 double 형 배열을 작성하고 1.2, 3.3, 6.7 값을 순서대로 입력하고 아래와 같이 출력되도록 for문을 작성하세요.*/

	public static void main(String[] args) {
		
		double[] doubleArr = new double[3];
		doubleArr[0] = 1.2;
		doubleArr[1] = 3.3;
		doubleArr[2] = 6.7;
		
		for(int i = 5; i >= doubleArr.length; i--) {
			System.out.println(doubleArr[i-3]);
		
		
//		for(int i = doubleArr.length - 1; i >= 0; i--) {
//			System.out.println(doubleArr[i]);
		}
		

	}

}
