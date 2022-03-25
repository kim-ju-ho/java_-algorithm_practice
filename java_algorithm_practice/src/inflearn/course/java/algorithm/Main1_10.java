package inflearn.course.java.algorithm;

/*����

�� ���� ���ڿ� s�� ���� t�� �־����� ���ڿ� s�� �� ���ڰ� ���� t�� ������ �ּҰŸ��� ����ϴ� ���α׷��� �ۼ��ϼ���.


�Է�
ù ��° �ٿ� ���ڿ� s�� ���� t�� �־�����. ���ڿ��� ���ڴ� �ҹ��ڷθ� �־����ϴ�.

���ڿ��� ���̴� 100�� ���� �ʴ´�.


���
ù ��° �ٿ� �� ���ڿ� s�� �� ���ڰ� ���� t�� ������ �Ÿ��� ������� ����Ѵ�.*/
public class Main1_10 {
	public static int[] solution(String str, char t) {
		
		int[] answer = new int[str.length()];
		int p = 1000;
		for(int i =0;i<str.length();i++) {
			if(str.charAt(i)==t) {
				p=0;
				
			}else {
				p++;
				answer[i] = p;
			}
		}
		p=1000;
		for(int i =str.length()-1;i>=0;i--) {
			if(str.charAt(i)==t) {
				p=0;
				
			}else {
				p++;
				answer[i] = Math.min(answer[i], p);
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		
		int[] answer = solution("teachermode",'e');
		for(int i =0;i<answer.length;i++) {
			System.out.print(answer[i]);
		}
	}
}
