import java.util.Scanner;

public class Main {

	private static int i, n, count, num;
	static int[] digits;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		digits = new int[n];
		i = 0;
		count = 0;
		recursion();
		System.out.println(count);
		sc.close();
	}

	static void recursion() {
		if (i == 0) {
			digits[i] = 1;
			i++;
			recursion();
			i--;
			digits[i] = 2;
			i++;
			recursion();
		} else if (i == n) {
			num = 0;
			for (int digit : digits) {
				num *= 10;
				num += digit;
			}
			if (num % 3 == 0) {
				count++;
			}
		} else {

			digits[i] = 2;
			i++;
			recursion();
			i--;
			digits[i] = 1;
			i++;
			recursion();
			i--;
			digits[i] = 0;
			i++;
			recursion();
			i--;
		}
	}
}