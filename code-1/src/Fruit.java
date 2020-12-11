import java.util.Arrays;
import java.util.Scanner;

public class Fruit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		
		int count = input.nextInt();
		int price = 0;
		
		int[] Array = new int[count];
		
		for(int i =0; i<count; i++) {
			Array[i]=input.nextInt();
		}
		Arrays.sort(Array);
		
		
		for(int i = 0; i<count; i++) {
			if(i%2==0)
				Array[i]=0;
		}
		
		for(int i = 0; i<count; i++) {
			price += Array[i];
		}
		
		System.out.println(price);

		
		

	}

}
