package inflearn.course.java.algorithm;

/*����

���ڿ� ���ڰ� �����ִ� ���ڿ��� �־����� �� �� ���ڸ� �����Ͽ� �� ������� �ڿ����� ����ϴ�.

���� ��tge0a1h205er������ ���ڸ� �����ϸ� 0, 1, 2, 0, 5�̰� �̰��� �ڿ����� ����� 1205�� �˴ϴ�.

�����Ͽ� ��������� �ڿ����� 100,000,000�� ���� �ʽ��ϴ�.


�Է�
ù �ٿ� ���ڰ� ���� ���ڿ��� �־����ϴ�. ���ڿ��� ���̴� 100�� ���� �ʽ��ϴ�.


���
ù �ٿ� �ڿ����� ����մϴ�*/

public class Main1_9 {
	
	public static String solution(String str) {
		String answer = "";
		str = str.toLowerCase().replaceAll("[^0-9]", "");
		System.out.println(Integer.parseInt(str));
		return answer;
	}
	
	public static void main(String[] args) {
		
		System.out.println(solution("g0en2T0s8eSoft"));
	}

}
