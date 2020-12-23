package chap01;

import java.util.Scanner;

public class Digits {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int no;
		
		System.out.println("2자리의 정수를 입력하세요.");
		
		do {
			System.out.println("입력 : ");
			no = stdIn.nextInt();
			
			// 단축 평가(short circuit evaluation)
			// 왼쪽 피연산자의 평가 결과만으로 정확해지는 경우 오른 쪽 피연산자의 평가를 
			// 수행하지 않는다.
		}while(no<10||no>99);
		
		System.out.println("변수 no의 값은"+ no+"가(이) 되었습니다.");
	}
}
