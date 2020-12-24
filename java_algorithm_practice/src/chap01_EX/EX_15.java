package chap01_EX;

public class EX_15 {
	
	static void triangleLU(int n ) {
		for(int i =0; i<n; i++) {
			for(int j =0;j<n-i;j++) {
				
				System.out.print("*");
			}
			System.out.println();
		}
	}
	static void triangleRU(int n) {
		for(int i =0;i<n;i++) {
			for(int j=n;j>=i;i=j--) {
				if(j<=i) {
					System.out.print("*");
					
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		triangleLU(10);
	}
}
