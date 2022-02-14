package chap01_EX;

public class EX_17 {

	static void npira(int n) {
		for(int i=0;i<n;i++){
			for(int j=0;j<3-i;j++){
				System.out.print(" "); 
			}
			for(int j=0;j<2*i+1;j++){
				System.out.print(i+1); 
			}
			System.out.println("");
		} 
	}
	public static void main(String[] args) {
		npira(4);
	}
}
