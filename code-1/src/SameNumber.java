import java.util.Scanner;

public class SameNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("2�ڸ��� ���� �Է�(10~99)>>");
		int input = sc.nextInt();
		
		if(input%11==0)
			System.out.println("yes! 10�� �ڸ��� 1�� �ڸ��� �����ϴ�.");
		else
			System.out.println(("no! 10�� �ڸ��� 1�� �ڸ��� �����ʽ��ϴ�."));
		
		sc.close();

	}

}
