package inflearn.course.java.algorithm;


/*����

�տ��� ���� ���� �ڿ��� ���� ���� ���� ���ڿ��� �Ӹ�����̶�� �մϴ�.

���ڿ��� �ԷµǸ� �ش� ���ڿ��� �Ӹ�����̸� "YES", �ƴϸ� ��NO"�� ����ϴ� ���α׷��� �ۼ��ϼ���.

�� ȸ���� �˻��� �� ���ĺ��� ������ ȸ���� �˻��ϸ�, ��ҹ��ڸ� �������� �ʽ��ϴ�.

���ĺ� �̿��� ���ڵ��� �����մϴ�.


�Է�
ù �ٿ� ���� 100�� ���� �ʴ� ������ ���� ���ڿ��� �־����ϴ�.


���
ù ��° �ٿ� �Ӹ���������� ����� YES �Ǵ� NO�� ����մϴ�*/
public class Main1_8 {

	public static String solution(String str) {
		String answer = "NO";
		
		str = str.toUpperCase().replaceAll("[^A-Z]","");
		String tmp = new StringBuilder(str).reverse().toString();
		if(tmp.equals(tmp)) {
			return "YES";
		}
		
	
		return answer;
	}
	public static void main(String[] args) {
		System.out.println(solution("found7, time: study; Yduts; emit, 7Dnuof"));
	}
}
