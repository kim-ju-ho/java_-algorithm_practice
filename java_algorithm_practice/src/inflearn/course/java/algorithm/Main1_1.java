package inflearn.course.java.algorithm;
/*
 * 1. ���� ã��
����

�� ���� ���ڿ��� �Է¹ް�, Ư�� ���ڸ� �Է¹޾� �ش� Ư�����ڰ� �Է¹��� ���ڿ��� �� �� �����ϴ��� �˾Ƴ��� ���α׷��� �ۼ��ϼ���.

��ҹ��ڸ� �������� �ʽ��ϴ�.���ڿ��� ���̴� 100�� ���� �ʽ��ϴ�.


�Է�
ù �ٿ� ���ڿ��� �־�����, �� ��° �ٿ� ���ڰ� �־�����.

���ڿ��� ���� ���ĺ����θ� �����Ǿ� �ֽ��ϴ�.
 * 
 * */
import java.util.Scanner;

public class Main1_1 {

	public static int solution(String str, char t) {
		int answer =0;
		str= str.toUpperCase();
		// charŸ���� �빮�ڷ� �ٲܶ��� character.toUpperCase
		t = Character.toUpperCase(t);
		System.out.println(str);
		// for��
//		for(int i = 0;i<str.length();i++){
//			// String Ÿ���� �ε����� charAt(i)�� �����
//			if(str.charAt(i)==t) answer ++;
//		}
	    // ���� for��
		// StringŸ���� �����ϳ��� ���ڹ迭�� ���� toCharArray()
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
