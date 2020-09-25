
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, sum = 0, a;
		int temp;
		n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		for(int i = 0; i < n; i++) {
			temp = sum/2;
			a = 0;
			for(int j = 0; j < n / 2; j++) {
				if(i+a+1 < n)
					temp -= arr[i+a+1];
				else
					temp -= arr[i+a+1-n];
				a+=2;
			}
			System.out.println(temp);
		}
		sc.close();
	}
}
