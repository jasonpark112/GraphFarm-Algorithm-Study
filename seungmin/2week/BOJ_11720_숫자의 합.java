import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); // ù ��° ���� �Է� (������ ����)
		String sNum = sc.next(); // �� ��° ���� �Է� (���� ���� ������ ����)
		
		char[] cNumArr = sNum.toCharArray();
		
		int sum = 0; // ������ ���� ����
		for (int i=0; i<cNumArr.length; i++) {
			sum += cNumArr[i] - 48; // char[]�� �� ����� ���ڸ� ���ڷ� ��ȯ �� ����
		}
		
		System.out.println(sum);
		
		sc.close();
	}
}