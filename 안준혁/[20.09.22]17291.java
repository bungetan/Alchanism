package æ»¡ÿ«ı;
import java.util.Scanner;

public class Main {

	private static int a;
	private static int[] arr, arr2;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		arr = new int[a];
		arr2 = new int[a];
		arr[0] = 1;
		for(int i = 0; i < a - 1; i++) {
			arr[i+1] = arr[i] * 2;
			if(i == 2) {
				arr[i+1] -= arr[i-2];
			}
			if(i > 3)
			{
				if(i % 2 == 0) {
					arr[i+1] -= arr[i-3];
					arr[i+1] -= arr[i-4];
				}
			}
		}
		for(int i = 0; i < a; i++)
			System.out.println(arr[i]);
		sc.close();
	}
}