package inflearn.course.java.algorithm;


/*����

�տ��� ���� ���� �ڿ��� ���� ���� ���� ���ڿ��� ȸ�� ���ڿ��̶�� �մϴ�.

���ڿ��� �ԷµǸ� �ش� ���ڿ��� ȸ�� ���ڿ��̸� "YES", ȸ�� ���ڿ��� �ƴϸ� ��NO"�� ����ϴ� ���α׷��� �ۼ��ϼ���.

�� ȸ���� �˻��� �� ��ҹ��ڸ� �������� �ʽ��ϴ�.


�Է�
ù �ٿ� ���� 100�� ���� �ʴ� ������ ���� ���ڿ��� �־����ϴ�.


���
ù ��° �ٿ� ȸ�� ���ڿ������� ����� YES �Ǵ� NO�� ����մϴ�*/

public class Main1_7 {

	public String solution(String str) {
		String answer = "YES";
		// 1. ���� �빮�� �� �ҹ��ڷ� ���� �ٲ��ش�.
//		str = str.toUpperCase();
//		int len = str.length();
//		for(int i =0;i<len/2;i++) {
//			if(str.charAt(i) != str.charAt(len-i-1)) {
//				return "No";
//				
//			}
//		}
		// StringBuilder �� Ǯ��
		String tmp = new StringBuilder(str).reverse().toString();
		// equalsIgnoreCase�� string�� ���Ҷ� ��ҹ��ڸ� �������� �ʴ´�.
		if(!str.equalsIgnoreCase(tmp)){
			return "NO";
		}
		
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main1_7 T = new Main1_7();
		
		System.out.println(T.solution("gooG"));
	}
}
