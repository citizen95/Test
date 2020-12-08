import java.util.Scanner;

public class Change {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int N = input.nextInt();
		int K = input.nextInt();
		int value =0;
		int sum = 0;
		
		int[] Array = new int[N];
		int[] Array1 = new int[N];
		
		for(int i = 0; i<N; i++) {
			Array[i]= input.nextInt();
		}
		
		for(int i = N-1; i>=0; i--) {
			value = K/Array[i];
			Array1[i]=value;
			K=K%Array[i];
			
			
		}
		for(int i = 0; i<N; i++) {
			System.out.print("Array1ดย "+ Array1[i]);
			System.out.println();
		}
		
		
		for(int i = 0; i<N; i++) {
			sum += Array1[i]; 
		}
		
		System.out.println(sum);
		
		

	}

}
