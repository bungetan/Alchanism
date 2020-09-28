import java.util.Scanner;

public class Main {

	static int n;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		sc.nextLine();
		int[] arr = new int[n];
		int[] arr2 = new int[n];
		String s;
		String[] as = new String[2];
		int temp, temp2, gcd, mom, son;
		for (int i = 0; i < n; i++) {
			s = sc.nextLine();
			as = s.split(" ");
			temp = Integer.parseInt(as[0]);
			temp2 = Integer.parseInt(as[1]);
			gcd = gcd(temp, temp2);
			arr[i] = temp / gcd;
			arr2[i] = temp2 / gcd;
		}
	}
}