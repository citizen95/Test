import java.util.Scanner;

public class NumberGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~99 ������ ������ �Է��Ͻÿ�>>");
		int number = sc.nextInt();
		int number1;
		int count=0;
		
		number1= number%10;
		if(number1==3 || number1 ==6 || number1==9) 
			count++;
		number1 =number/10;
		if(number1==3 || number1 ==6 || number1==9)
			count++;
		if(count ==1 )
			System.out.println("�ڼ�¦");
		else if(count == 2)
			System.out.println("�ڼ�¦��");
		
		else
			System.out.println("3,6,9�� �����ϴ�.");
		
	}

}
