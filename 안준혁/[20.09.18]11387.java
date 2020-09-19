import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long[][] arr = new long[4][5];
		long[] power = new long[2];
		long[] afterpower = new long[2];
		for (int j = 0; j < 4; j++)
			for (int i = 0; i < 5; i++)
				arr[j][i] = sc.nextInt();
		for (int i = 0; i < 2; i++)
			power[i] = arr[i][0] * (100 + arr[i][1])
					* (100 * (100 - Math.min(100, arr[i][2])) + Math.min(100, arr[i][2]) * arr[i][3])
					* (100 + arr[i][4]);
		afterpower[0] = (arr[0][0] - arr[2][0] + arr[3][0]) * (100 + (arr[0][1] - arr[2][1] + arr[3][1]))
				* (100 * (100 - Math.min(100, (arr[0][2] - arr[2][2] + arr[3][2])))
						+ Math.min(100, (arr[0][2] - arr[2][2] + arr[3][2]))
								* (arr[0][3] - arr[2][3] + arr[3][3]))
				* (100 + (arr[0][4] - arr[2][4] + arr[3][4]));
		afterpower[1] = (arr[1][0] + arr[2][0] - arr[3][0]) * (100 + (arr[1][1] + arr[2][1] - arr[3][1]))
				* (100 * (100 - Math.min(100, (arr[1][2] + arr[2][2] - arr[3][2])))
						+ Math.min(100, (arr[1][2] + arr[2][2] - arr[3][2]))
								* (arr[1][3] + arr[2][3] - arr[3][3]))
				* (100 + (arr[1][4] + arr[2][4] - arr[3][4]));
		for (int i = 0; i < 2; i++) {
			if (power[i] < afterpower[i])
				System.out.println("+");
			else if (power[i] > afterpower[i])
				System.out.println("-");
			else
				System.out.println("0");
		}
		sc.close();
	}
}
