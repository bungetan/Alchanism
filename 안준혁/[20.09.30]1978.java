import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp, count = 0;
		boolean b = false;
		for (int i = 0; i < n; i++) {
			temp = sc.nextInt();
			if(temp != 1) {
				for (int j = 2; j < temp; j++) {
					if (temp % j == 0)
						b = true;
				}
				if(b == false)
					count++;
				else
					b = false;
			}
		}
		System.out.println(count);
		sc.close();
	}
}
