package chap01_EX;

public class EX_16 {
	
	static void spira(int n) {
		for(int i=0;i<4;i++){
			for(int j=0;j<3-i;j++){
				System.out.print(" "); 
			}
			for(int j=0;j<2*i+1;j++){
				System.out.print("*"); 
			}
			System.out.println("");
		} 
	    
	}
	
	public static void main(String[] args) {
		spira(5);
	}
}
