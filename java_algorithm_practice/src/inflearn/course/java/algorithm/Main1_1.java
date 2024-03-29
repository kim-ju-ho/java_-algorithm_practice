package inflearn.course.java.algorithm;
/*
 * 1. 문자 찾기
설명

한 개의 문자열을 입력받고, 특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 몇 개 존재하는지 알아내는 프로그램을 작성하세요.

대소문자를 구분하지 않습니다.문자열의 길이는 100을 넘지 않습니다.


입력
첫 줄에 문자열이 주어지고, 두 번째 줄에 문자가 주어진다.

문자열은 영어 알파벳으로만 구성되어 있습니다.
 * 
 * */
import java.util.Scanner;

public class Main1_1 {

	public static int solution(String str, char t) {
		int answer =0;
		str= str.toUpperCase();
		// char타임을 대문자로 바꿀때는 character.toUpperCase
		t = Character.toUpperCase(t);
		System.out.println(str);
		// for문
//		for(int i = 0;i<str.length();i++){
//			// String 타임의 인덱스는 charAt(i)을 사용함
//			if(str.charAt(i)==t) answer ++;
//		}
	    // 향상된 for문
		// String타임을 문자하나로 문자배열을 생성 toCharArray()
		for(char x: str.toCharArray()) {
			if(x==t) answer++;
		}
		
		return answer;
	}
	public static void main(String[] args) {
		
	    Scanner kb =new Scanner(System.in);
	    String str = kb.next();
	    char c =kb.next().charAt(0);
	    System.out.println(solution(str,c));
	    return ;
	}
	
}
