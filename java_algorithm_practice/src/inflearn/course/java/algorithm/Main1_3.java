package inflearn.course.java.algorithm;

import java.util.Scanner;
/*
 * 
3. ���� �� �ܾ�
����

�� ���� ������ �־����� �� ���� �ӿ��� ���� �� �ܾ ����ϴ� ���α׷��� �ۼ��ϼ���.

������� �� �ܾ�� �������� ���е˴ϴ�.


�Է�
ù �ٿ� ���̰� 100�� ���� �ʴ� �� ���� ������ �־����ϴ�. ������ ���� ���ĺ����θ� �����Ǿ� �ֽ��ϴ�.


���
ù �ٿ� ���� �� �ܾ ����Ѵ�. ���� ���̰� �� �ܾ �������� ��� ����ӿ��� ���� ���ʿ� ��ġ��

�ܾ ������ �մϴ�.*/

public class Main1_3 {
	public static String solution(String str) {
		String answer ="";
		int m = Integer.MIN_VALUE, pos;
		// split���� Ǯ��
//		String[] s = str.split(" ");
//		for(String x : s) {
//			int len = x.length();
//			if(len > m) {
//				m =len;
//				answer =x;
//			}
//		}
		// subString
		// ""�ȿ� ������ ù��° �ε����� ã���ִ� indexOf
		while((pos=str.indexOf(" " )) !=-1) {
			String tmp = str.substring(0,pos);
			int len = tmp.length();
			if(len>m) {
				m= len;
				answer =tmp;
			}
			str = str.substring(pos+1);
			
		}
		if(str.length()>m) answer =str;
		
		return answer;
		
	}
	
	
	
	  public static void main(String[] args){
		Scanner kb=new Scanner(System.in);
	    String str =kb.nextLine();
	    System.out.println(solution(str));
	  }
	}
