import java.util.Scanner;

public class Main {

	private static int i, n;
	static int[] digits;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		digits = new int[n];
		i = 0;
		recursion();
	}

	static void recursion() {
		if (i == 0) {
			digits[i] = 0;
			i++;
			recursion();
		} else if (i == n) {
			System.out.println(digits[n-1]);
		}
		else {
			if((i+1)%3 == 0 && (i+1)%2 == 0 ) {
				digits[i] = Math.min(digits[(i+1)/3-1],
						Math.min(digits[(i+1)/2-1],digits[i-1]))+1;
			}else if((i+1)%3 == 0) {
				digits[i] = Math.min(digits[(i+1)/3-1],digits[i-1])+1;
			}else if((i+1)%2 == 0) {
				digits[i] = Math.min(digits[(i+1)/2-1],digits[i-1])+1;
			}else {
				digits[i] = digits[i-1] + 1;
			}
			i++;
			recursion();
		}	
	}
}