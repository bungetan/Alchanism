import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int a, b, r;
		int temp, tempA, tempB;
		for(int i = 0; i < n; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			tempA = a;
			tempB = b;
			if(a < b) {
				temp = b;
				b = a;
				a = temp;
			}
			while(b != 0) {
				r = a % b; 
				a = b;			
				b = r;
			}
			arr[i] = tempA * tempB / a;
		}
		for(int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
	}
}