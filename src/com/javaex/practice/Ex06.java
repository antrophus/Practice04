package com.javaex.practice;

public class Ex06 {
	
	/*Ex06 주어진 문자열의 공백을 ','(콤마)로 변경 후 출력하세요.
	 char c[]={'t','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l'};
	 */

	public static void main(String[] args) {
		
		 char c[]={'t','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l'};
		 System.out.println(c);
		 c[4] = ',';
		 c[7] = ',';
		 c[9] = ',';
		 System.out.println(c);
		 
		// 문장 출력
			for (int i = 0; i < c.length; i++) {
				System.out.print(c[i]);
			}
			System.out.println("");

			// 배열의 검사하여 공백이면 콤마로 변경
			for (int i = 0; i < c.length; i++) {
				if (c[i] == ' ') {
					c[i] = ',';
				}
			}

			// 문장 출력
			for (int i = 0; i < c.length; i++) {
				System.out.print(c[i]);
			}
			System.out.println("");

	}

}
