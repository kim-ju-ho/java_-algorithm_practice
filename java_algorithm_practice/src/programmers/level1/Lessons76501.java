package programmers.level1;

/* 
 ���� ���ϱ�
���� ����
� �������� �ֽ��ϴ�. �� �������� ������ ���ʴ�� ���� ���� �迭 absolutes�� �� �������� ��ȣ�� ���ʴ�� ���� �Ҹ��� �迭 signs�� �Ű������� �־����ϴ�. +
���� �������� ���� ���Ͽ� return �ϵ��� solution �Լ��� �ϼ����ּ���.

���ѻ���
absolutes�� ���̴� 1 �̻� 1,000 �����Դϴ�.
absolutes�� ��� ���� ���� 1 �̻� 1,000 �����Դϴ�.
signs�� ���̴� absolutes�� ���̿� �����ϴ�.
signs[i] �� ���̸� absolutes[i] �� ���� ������ �������, �׷��� ������ �������� �ǹ��մϴ�.
*/
public class Lessons76501 {
	
	public static int solution(int[] absolutes, boolean[] signs) {
		
		int answer = 0;
        
		for(int i =0; i<absolutes.length;i++){
            if(signs[i] == true){
            	
                answer +=absolutes[i];
                
            }else{
            	
                answer -=absolutes[i];
            }
            
        }
		
		return answer;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] absolutes ={4,7,12};
		boolean[] signs = {true,false,true};
		System.out.println(solution(absolutes,signs));
	}

}
