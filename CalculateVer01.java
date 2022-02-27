/**
  �����̸�: �̸���
  ��¥: 22.1.21
  ���� : ��Ģ����Ver1
*/


import java.util.*;

class Calculate 
{
	int x, y;
	int result;
	char ch;
	//TestTEst
	// �Է¹��� �޼ҵ�
	void input() {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �� ���� �Է�(���� ����) : ");
		x = sc.nextInt();
		y = sc.nextInt();
		System.out.print("������ ������ �Է�(+ - * /) : ");
		char ch = sc.next().charAt(0);

	}

	// �� ������ �����ڸ� �Է¹޾� ���� ����ϴ� �޼ҵ�
	int cal() {
	
		result = 0;	

		if(ch == '+') {
			result = x + y;
		}
		else if(ch == '-') {
			result = x - y;
		}
		else if(ch == '*') {
			result = x * y;
		}
		else if(ch == '/') {
			result = x / y;
		}else {
			System.out.print("�����ȣ�� �߸��Ǿ����ϴ�.");
		}

		return result;

	}

	// ��� ��� �޼ҵ�
	void showResult(int s) {
		
		System.out.printf(">> %d %c %d = %d\n", x, ch, y, s);

	}

}


public class CalculateVer01 {

	public static void main(String[] args) {

		Calculate c = new Calculate();
		

		// �ȳ� �޼��� ���
		c.input();

		// ��� ���
		int t = c.cal();

		// ��� ���
		c.showResult(t);



	}
}




