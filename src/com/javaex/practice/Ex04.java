package com.javaex.practice;

public class Ex04 {
	
	/*Ex04 다음 주어진 배열 데이터를 이용하여 3의 배수의 개수와 배수의 합을 아래와 같이 출력하는 프로그램을 작성하세요.
	 int[] data = {1, 3, 5, 8, 9, 11, 15, 19, 18, 20, 30, 33, 31};
	 주어진 배열에서 3의 배수의 개수 => 6
	 주어진 배열에서 3의 배수의 합=> 108
	 */

	public static void main(String[] args) {
		
		int[] data = {1, 3, 5, 8, 9, 11, 15, 19, 18, 20, 30, 33, 31};
		
		int count = 0;
		int sum = 0;
				
		
		for(int i = 0; i<data.length; i++) {
			
			if(data[i]%3==0) {
				sum = sum + data[i];
				count++;
				
			}
			
		}
		
		System.out.println("주어진 배열에서 3의 배수의 개수=>" + count);
		System.out.println("주어진 배열에서 3의 배수의 합=>" + sum);
		
		
		
		
		

	}

}