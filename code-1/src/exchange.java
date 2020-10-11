import java.util.Scanner;

public class exchange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("원화를 입력하세요(단위 원)>>");
		int input = sc.nextInt();
		
		System.out.println(input + "원은 $" + input/1100.0 + "입니다.");
		
		sc.close();
		

	}

}
