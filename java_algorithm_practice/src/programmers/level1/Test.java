package programmers.level1;

import java.util.*;
import java.text.*;

public class Test {
	
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        
        for (int i = 0; i < arr1.length; i++) {
      
			answer += (arr2[i]<29)?arr2[i] - arr1[i]:21 - arr1[i];
			
		}
        return answer;
        
    }
	public String solution2(int month, int day) {
        String answer = "";
        Calendar endDay = Calendar.getInstance();
          endDay.set(Calendar.MONTH,month-1);        
          endDay.set(Calendar.DATE,day);
          endDay.add(Calendar.DATE, 98);
          answer = (endDay.get(Calendar.MONTH)+1)+"월"+endDay.get(Calendar.DATE)+"일";
        
        return answer;
        
    }


    public static void main(String[] args) {
    	
    	Test method = new Test();
    	// 1번
    	int[] arr1 = {9, 9, 8, 8, 7, 8, 9};
        int[] arr2 = {21, 25, 30, 29, 22, 23, 30};
        
    	int[] arr3 = {9, 7, 8, 9, 7, 9, 8};
        int[] arr4 = {23, 22, 26, 26, 29, 27, 22};    	
    	
        int[] arr5 = {9, 9, 9, 9, 7, 9, 8};
        int[] arr6 = {23, 23, 30, 28, 30, 23, 23};
        System.out.println(method.solution(arr5, arr6));
        
        // 2번
        System.out.println(method.solution2(1,18));
        System.out.println(method.solution2(11,27));
        System.out.println(method.solution2(6,22));
    }
}
