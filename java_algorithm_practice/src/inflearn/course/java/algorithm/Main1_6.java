package inflearn.course.java.algorithm;

/*
 ����

�ҹ��ڷ� �� �Ѱ��� ���ڿ��� �ԷµǸ� �ߺ��� ���ڸ� �����ϰ� ����ϴ� ���α׷��� �ۼ��ϼ���.

�ߺ��� ���ŵ� ���ڿ��� �� ���ڴ� ���� ���ڿ��� ������ �����մϴ�.


�Է�
ù �ٿ� ���ڿ��� �Էµ˴ϴ�. ���ڿ��� ���̴� 100�� ���� �ʴ´�.


���
ù �ٿ� �ߺ����ڰ� ���ŵ� ���ڿ��� ����մϴ�.
*/


public class Main1_6 {

	public String solution(String str) {
		String answer ="";
		for(int i =0;i<str.length();i++) {
			//System.out.println(str.charAt(i)+ " " + i + " " + str.indexOf(str.charAt(i)));
			//indexOf �ش� ���ڰ� String���� ���� ���� ���ö��� ���ؽ��� ���
			if(str.indexOf(str.charAt(i))==i) {
				answer += str.charAt(i);
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main1_6 T = new Main1_6();
		
		System.out.println(T.solution("ksekkset"));
	}
}
