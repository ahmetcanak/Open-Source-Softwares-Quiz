import java.util.Scanner;

public class main {

	static void display(int n) {
		int space = n / 2, num = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= space; j++)
				System.out.print(" ");
			for (int k = 1; k <= num; k++) {
				System.out.print("*");
			}
			System.out.println();
			if (i <= n / 2) {
				space = space - 1;
				num = num + 2;
			}
			else {
				space = space + 1;
				num = num - 2;
			}
		}
	}
	
	static boolean checkOdd(int num) {
		if (num % 2 != 0)
			return true;
		else
			System.out.println("Value not perfect.");

		return false;
	}

	public static void main(String[] args) {
		System.out.println("Enter odd value");
		Scanner get = new Scanner(System.in);
		int number = get.nextInt();
		if(checkOdd(number))
			display(number);
		
	}

}
