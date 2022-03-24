package inflearn.course.java.algorithm;

import java.util.Scanner;

/*
 * 설명

영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,

특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.


입력
첫 줄에 길이가 100을 넘지 않는 문자열이 주어집니다.


출력
첫 줄에 알파벳만 뒤집힌 문자열을 출력합니다.
*/

public class Main1_5 {
	public String solution(String str) {
		String answer;
		char[] s = str.toCharArray();
		int lt =0;
		int rt =str.length()-1;
		
		while(lt<rt) {
			// chararacter.isAlphabetic 괄호안의 변수가 알파벳이면 True 반환
			if(!Character.isAlphabetic(s[lt])) {
				lt++;
			}else if(!Character.isAlphabetic(s[rt])) {
				rt --;
			}else {
				char tmp = s[lt];
				s[lt] = s[rt];
				s[rt]= tmp;
				lt ++;
				rt --;
			}
		}
		// String.valueOf  괄호안을 String 형으로 변환
		answer = String.valueOf(s);
		return answer;
	}



	public static void main(String[] args){
		Main1_5 m = new Main1_5();
		System.out.println(m.solution("a#b!GE*T@S"));
		
	}
}
