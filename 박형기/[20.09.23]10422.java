package Part1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class C10422 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int l = Integer.parseInt(st.nextToken());
		BigInteger f = new BigInteger("1");
		BigInteger cat = new BigInteger("1");
		BigInteger div = new BigInteger("1000000007");
		for(int i = 0 ; i < l; i++) {
			int a = Integer.parseInt(br.readLine());
			if(a % 2== 0 ) {
				a = a / 2;
				f = fact(a);
				cat = fact(2*a).divide(fact(1+a).multiply(f));
				System.out.println(cat.mod(div));
			}
			else {
				System.out.println(0);
			}
		}
		
	}public static BigInteger fact(int n) {
		if (n <= 1)
			return BigInteger.ONE;
		else 
			return fact(n-1).multiply(new BigInteger(""+ n));

	}

}
