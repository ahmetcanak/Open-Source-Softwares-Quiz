import java.util.Scanner;

public class question2 {
	public static void main(String[] args) {
		Scanner get = new Scanner(System.in);
		System.out.println("Enter number.");
		int num = get.nextInt();
		int rows = num;

		for (int j = 0; j <= rows; j++) {
			for (int i = 0; i < num; i++) {
				System.out.print("*");
			}
			num--;
			System.out.println();
		}

	}
}
