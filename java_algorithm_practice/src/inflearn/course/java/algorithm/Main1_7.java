package inflearn.course.java.algorithm;


/*설명

앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 회문 문자열이라고 합니다.

문자열이 입력되면 해당 문자열이 회문 문자열이면 "YES", 회문 문자열이 아니면 “NO"를 출력하는 프로그램을 작성하세요.

단 회문을 검사할 때 대소문자를 구분하지 않습니다.


입력
첫 줄에 길이 100을 넘지 않는 공백이 없는 문자열이 주어집니다.


출력
첫 번째 줄에 회문 문자열인지의 결과를 YES 또는 NO로 출력합니다*/

public class Main1_7 {

	public String solution(String str) {
		String answer = "YES";
		// 1. 먼저 대문자 나 소문자로 전부 바꿔준다.
//		str = str.toUpperCase();
//		int len = str.length();
//		for(int i =0;i<len/2;i++) {
//			if(str.charAt(i) != str.charAt(len-i-1)) {
//				return "No";
//				
//			}
//		}
		// StringBuilder 로 풀기
		String tmp = new StringBuilder(str).reverse().toString();
		// equalsIgnoreCase는 string을 비교할때 대소문자를 구분하지 않는다.
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
