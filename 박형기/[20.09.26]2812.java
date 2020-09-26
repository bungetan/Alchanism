package Part1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class C2812 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		String number = br.readLine();
		Deque<Integer> list = new LinkedList<>();
		int count = 0;
		list.add(number.charAt(0) - '0');
		for (int i = 1; i < number.length(); i++) {
			if (count < K) {
				while (!list.isEmpty() && count < K) {
					if (list.peekLast() < number.charAt(i) - '0') {
						list.pollLast();
						count++;
					}else {
						break;
					}
				}
				list.add(number.charAt(i) - '0');
			} else {
				list.add(number.charAt(i) - '0');
			}

		}
		for (int i = 0; i < N - K; i++) {
			System.out.print(list.poll());
		}
	}

}
