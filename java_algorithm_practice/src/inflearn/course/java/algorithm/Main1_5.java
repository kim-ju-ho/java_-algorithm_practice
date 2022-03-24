package inflearn.course.java.algorithm;

import java.util.Scanner;

/*
 * ����

���� ���ĺ��� Ư�����ڷ� ������ ���ڿ��� �־����� ���� ���ĺ��� ������,

Ư�����ڴ� �ڱ� �ڸ��� �״�� �ִ� ���ڿ��� ����� ����ϴ� ���α׷��� �ۼ��ϼ���.


�Է�
ù �ٿ� ���̰� 100�� ���� �ʴ� ���ڿ��� �־����ϴ�.


���
ù �ٿ� ���ĺ��� ������ ���ڿ��� ����մϴ�.
*/

public class Main1_5 {
	public String solution(String str) {
		String answer;
		char[] s = str.toCharArray();
		int lt =0;
		int rt =str.length()-1;
		
		while(lt<rt) {
			// chararacter.isAlphabetic ��ȣ���� ������ ���ĺ��̸� True ��ȯ
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
		// String.valueOf  ��ȣ���� String ������ ��ȯ
		answer = String.valueOf(s);
		return answer;
	}



	public static void main(String[] args){
		Main1_5 m = new Main1_5();
		System.out.println(m.solution("a#b!GE*T@S"));
		
	}
}
