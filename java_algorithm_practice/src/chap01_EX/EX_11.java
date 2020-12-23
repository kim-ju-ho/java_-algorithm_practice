package chap01_EX;

import java.util.Scanner;

public class EX_11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;
		System.out.println("양의 정수를 입력해주세요");
		do {
			number= sc.nextInt();
			if(number<0) {
				System.out.println("양의 정수를 입력해주세요");
			}
		}while(number<0);
		int length = (int) (Math.log10(number) + 1);
		System.out.println("그 수는"+length + "자리 입니다.");
	}
}
