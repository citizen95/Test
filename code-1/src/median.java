import java.util.Scanner;

public class median {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� 3�� �Է�>>");
		int one = sc.nextInt();
		int two = sc.nextInt();
		int three = sc.nextInt();
		int middle;
		
		if(one > two && one < three || one<two&&one>three) {
			middle=one;
		System.out.print("�߰����� : " + one);
		}
		else if(two> three && two < one || two<three && two>one) {
		
			middle=two;
		System.out.print("�߰����� : " + two);
		}
		else {
			middle=three;
		System.out.println("�߰����� : " + three);
		}
		sc.close();
		
		
		
		

	}

}
