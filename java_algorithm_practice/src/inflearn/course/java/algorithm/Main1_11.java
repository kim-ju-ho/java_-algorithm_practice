package inflearn.course.java.algorithm;


/*����

���ĺ� �빮�ڷ� �̷���� ���ڿ��� �Է¹޾� ���� ���ڰ� �������� �ݺ��Ǵ� ��� �ݺ��Ǵ�

���� �ٷ� �����ʿ� �ݺ� Ƚ���� ǥ���ϴ� ������� ���ڿ��� �����ϴ� ���α׷��� �ۼ��Ͻÿ�.

�� �ݺ�Ƚ���� 1�� ��� �����մϴ�.


�Է�
ù �ٿ� ���ڿ��� �־�����. ���ڿ��� ���̴� 100�� ���� �ʴ´�.


���
ù �ٿ� ����� ���ڿ��� ����Ѵ�.*/
public class Main1_11 {

	public static String solution(String str) {
		String answer = "";
		
		str = str+" ";
		int count = 1;
		for(int i =0;i<str.length()-1;i++) {
			if(str.charAt(i) == str.charAt(i+1)) {
				count++;
				
			}else {
				answer +=str.charAt(i);
				if(count >1) {
					answer += count;
					count = 1;
				}
			
			}
		}
		
		return answer;
							
		
	}
	
	public static void main(String[] args) {
		System.out.println(solution("KKHSSSSSSSE"));
	}
}
