package chap01_EX;

public class EX_01 {
	
	static int max4(int a, int b, int c, int d) {
		
		int max = a;
		if(b > max) max = b;
		if(c > max) max = c;
		if(d > max) max = d;
		
		return max;
	}
	
	public static void main(String[] args) {
		System.out.println(max4(2,3,4,5)); 
	}
}
