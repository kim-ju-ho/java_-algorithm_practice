package inflearn.course.java.algorithm;

import java.util.Scanner;

/*
����

�빮�ڿ� �ҹ��ڰ� ���� �����ϴ� ���ڿ��� �Է¹޾� �빮�ڴ� �ҹ��ڷ� �ҹ��ڴ� �빮�ڷ� ��ȯ�Ͽ� ����ϴ� ���α׷��� �ۼ��ϼ���.


�Է�
ù �ٿ� ���ڿ��� �Էµȴ�. ���ڿ��� ���̴� 100�� ���� �ʽ��ϴ�.

���ڿ��� ���� ���ĺ����θ� �����Ǿ� �ֽ��ϴ�.


���
ù �ٿ� �빮�ڴ� �ҹ��ڷ�, �ҹ��ڴ� �빮�ڷ� ��ȯ�� ���ڿ��� ����մϴ�.
 */
public class Main1_2 {
	public static String solution(String str) {
		String answer ="";
		
//		for(char x : str.toCharArray()) {
//			if(Character.isLowerCase( x )) {
//				answer += Character.toUpperCase(x);
//			}else {
//				answer+=Character.toLowerCase(x);
//			}
//		}
		// �ƽ�Ű�ڵ�� Ǯ�� 
		// �빮�� : 65 ~ 90
		// �ҹ��� : 97 ~ 122
		// ��ҹ��� ��ȭ�� �ҹ��� - 32
		for(char x : str.toCharArray()) {
			if(x>=97 && x<=122) answer +=(char)(x-32);
			else answer += (char)(x+32);
		}
		return answer;
	}
	
	  public static void main(String[] args){
	    Scanner kb=new Scanner(System.in);
	    String str =kb.next();
	    
	    
	    System.out.println(solution(str));
	  }
	}
