package Part1;

import java.io.BufferedReader;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class C1766 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[] number = new int[N];
		
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			ArrayList<Integer> arr = new ArrayList<>();
			list.add(arr);
		}
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int num1 = Integer.parseInt(st.nextToken());
			int num2 = Integer.parseInt(st.nextToken());
			list.get(num1 - 1).add(num2);
			number[num2 - 1] += 1;
		}

		Queue<Integer> queue = new PriorityQueue<>();
		for (int i = 0; i < N; i++) {
			if (number[i] == 0) {
				queue.add(i + 1);
			}
		}

		while (!queue.isEmpty()) {
			int a = queue.poll();
			sb.append(a + " ");
			for(int i = 0 ; i < list.get(a - 1).size(); i++) {
				int zi = list.get(a - 1).get(i);
				number[zi - 1] -= 1;
				if(number[zi - 1] == 0) {
					queue.add(zi);
				}
			}
			
		}
		bw.write(sb.toString());
		bw.flush();
	}
}
