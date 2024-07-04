package com.javaex.practice;

public class Ex01 {
	
	/*[문제] Ex01 아래의 코드를 실행하면 출력 결과에 오류가 발생한다. 오류 수정 후 출력 결과를 예상하고 코드로 확인해 보세요.
	  [코드]
	  public static void main(String[] args) {
	  
		int[] intArray = new int[5];
		intArray[0] = 3;
		intArray[1] = 7;
		intArray[2] = 12;
		
		int result = 0;
		
		for(int i = 0; i <= intArray.length; i++) { // 배열의 없는 방을 찾아서 에러남; = 빼고 <만 남겨두어야 한다.
			result = result + intArray[i];
		
		}
		System.out.println(result);

	}

}

	  */

	public static void main(String[] args) {
		
		int[] intArray = new int[5];
		intArray[0] = 3;
		intArray[1] = 7;
		intArray[2] = 12;
		
		int result = 0;
		
		for(int i = 0; i < intArray.length; i++) { 
			result = result + intArray[i];
		
		}
		System.out.println(result);

	}

}
