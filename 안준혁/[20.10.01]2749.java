import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	static long a, b, temp, rn;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger n = sc.nextBigInteger();
		long a = 0;
		long b = 1;
		rn = n.remainder(BigInteger.valueOf(1500000)).longValue();
		if (rn == 0)
			System.out.println(a);
		else {
			for(int i = 1; i < rn; i++) {
				temp = b;
				b = (a+b)%1000000;
				a = temp;
			}
			System.out.println(b);
		}
		sc.close();
	}
}
