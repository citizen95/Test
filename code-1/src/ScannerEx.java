import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�̸�, ����, ����, ü��, ���ſ��θ� ��ĭ���� �и��Ͽ� �Է��ϼ���");
		Scanner sc = new Scanner(System.in);
		
		
		String name = sc.next();
		System.out.print("�̸��� "+ name + " , ");
		
		String city = sc.next();
		System.out.print("���ô� "+ city + " , ");
		
		int age =  sc.nextInt();
		System.out.print("���̴�  "+ age + "�� , ");
		
		double weight = sc.nextDouble();
		System.out.print("ü���� "+ weight + " , ");
		
		boolean isSingle = sc.nextBoolean();
		System.out.println("���ſ��δ� " + isSingle + "�Դϴ�.");
		
		sc.close();

	}

	

}
