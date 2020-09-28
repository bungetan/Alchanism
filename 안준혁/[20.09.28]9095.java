import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	private static int count;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			count = 0;
			recursion(sc.nextInt());
			arr[i] = count;
		}
		for(int i=0; i<n; i++) {
			System.out.println(arr[i]);
		}
	}
	
	static void recursion(int n) {
		if(n == 0) {
			count++;
		}
		else if(n > 0) {
			recursion(n-1);
			recursion(n-2);
			recursion(n-3);
		}
	}
}
