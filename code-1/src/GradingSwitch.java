import java.util.Scanner;

public class GradingSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		char grade;
		System.out.print("������ �Է��ϼ���(0~100) : ");
		int score = sc.nextInt();
		switch (score/10) {
		case 10:
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'c';
			break;
		case 6:
			grade = 'D';
			break;
			default:
				grade = 'F';						
		}
		System.out.println("������" + grade + "�Դϴ�");
		
		sc.close();

	}

}
