import java.util.Scanner;

public class exchange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("��ȭ�� �Է��ϼ���(���� ��)>>");
		int input = sc.nextInt();
		
		System.out.println(input + "���� $" + input/1100.0 + "�Դϴ�.");
		
		sc.close();
		

	}

}
