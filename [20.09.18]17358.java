import java.math.BigInteger;
import java.util.Scanner;

public class Q17358 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int cup = input.nextInt();

        BigInteger answer = BigInteger.ONE;
        int count = 1;

        BigInteger devider = BigInteger.valueOf(1000000007);

        for(int i = 0; i < cup/2; i++) {

            answer = answer.multiply(BigInteger.valueOf(count));
            count += 2;
        }
        System.out.println(answer.remainder(devider));


    }

}
