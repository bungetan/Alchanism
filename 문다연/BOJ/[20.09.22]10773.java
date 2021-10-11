import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        Stack<Integer> stack = new Stack<Integer>();

        int k = Integer.parseInt(st.nextToken());
        for (int i = 0; i < k; i++) {
            st = new StringTokenizer(br.readLine());
            int tmp = Integer.parseInt(st.nextToken());
            if (tmp == 0)
                stack.pop();
            else
                stack.push(tmp);
        }

        int sum = 0;
        while (!stack.isEmpty())
            sum += stack.pop();
        System.out.println(sum);
    }
}
