package inflearn.course.java.algorithm;

import java.util.ArrayList;
import java.util.Scanner;

/*
 ����

N���� �ܾ �־����� �� �ܾ ������ ����ϴ� ���α׷��� �ۼ��ϼ���.


�Է�
ù �ٿ� �ڿ��� N(3<=N<=20)�� �־����ϴ�.

�� ��° �ٺ��� N���� �ܾ �� �ٿ� �ϳ��� �־����ϴ�. �ܾ�� ���� ���ĺ����θ� �����Ǿ� �ֽ��ϴ�.


���
N���� �ܾ �Էµ� ������� �� �ٿ� �ϳ��� ����� ����մϴ�.
 */
public class Main1_4 {
	
	public static ArrayList<String> solution(int n,String[] str){
		ArrayList<String> answer = new ArrayList<String>();
		// StringBuilder
//		for(String x : str) {
//			String tmp = new StringBuilder(x).reverse().toString();
//			answer.add(tmp);
//		}
//		
		// �ϳ��ϳ� ������
		for(String x : str) {
			char[] s = x.toCharArray();
			int lt = 0, rt =x.length()-1;
			while(lt<rt) {
				char tmp = s[lt];
				s[lt] =s[rt];
				s[rt] = tmp;
				lt ++;
				rt --;
			}
			// �迭�� String���� �ٲپ��ִ� valueOf
			String tmp = String.valueOf(s);
			answer.add(tmp);
		}
		
		return answer;
	}
	
	
	  public static void main(String[] args){
	    Scanner kb=new Scanner(System.in);
	    int n = kb.nextInt();
	    String[] str = new String[n];
	    for(int i =0; i<str.length;i++) {
	    	str[i] =kb.next();
	    }
	    for(String x : solution(n,str)) {
	    	System.out.println(x);
	    }
	    return ;
	  }
	}