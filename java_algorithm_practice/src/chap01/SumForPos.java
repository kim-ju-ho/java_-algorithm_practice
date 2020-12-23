package chap01;

import java.util.Scanner;

// do while 문은 루프 본문을 한 번 실행한다음 다음에 계속 반복 실행할건지
// 사후 판단하는 반복문이다.
public class SumForPos {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n ;
		
		System.out.println("1부터 n까지의 합을 구합니다");
		
		do { 
			System.out.println("n의 갑 :");
			n = stdIn.nextInt();
			
		}while(n <= 0);
		
		int sum = 0;
		
		for(int i =1; i<=n;i++) {
			sum +=i;
		}
		System.out.println("1부터" + n + "까지의 합은 ="+sum+ "입니다");
	}
}
