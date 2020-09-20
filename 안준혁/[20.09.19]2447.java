import java.util.Scanner;

public class Main {
	private static char[][] arr;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		arr = new char[n][n];
		star(0, 0, n, false);
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
		sc.close();
	}

	static void star(int x, int y, int n, boolean blank) {
		if (blank) {
			for (int i = x; i < x + n; i++) {
				for (int j = y; j < y + n; j++) {
					arr[i][j] = ' ';
				}
			}
			return;
		}
		
		if (n == 1) {
			arr[x][y] = '*';
			return;
		}

		int count = 0;
		for (int i = x; i < x + n; i += n / 3) {
			for (int j = y; j < y + n; j += n / 3) {
				count++;
				if (count == 5) {
					star(i, j, n / 3, true);
				} else {
					star(i, j, n / 3, false);
				}
			}
		}

	}
}