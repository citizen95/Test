import java.util.Scanner;

public class SameNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("2자리수 정수 입력(10~99)>>");
		int input = sc.nextInt();
		
		if(input%11==0)
			System.out.println("yes! 10의 자리와 1의 자리가 같습니다.");
		else
			System.out.println(("no! 10의 자리와 1의 자리가 같지않습니다."));
		
		sc.close();

	}

}
