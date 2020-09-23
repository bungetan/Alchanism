package Part1;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class C15703 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int count = 0;
		Queue<Integer> queue = new PriorityQueue<>();
		for (int i = 0; i < N; i++) {
			int num = Integer.parseInt(st.nextToken());
			queue.add(num);
		}
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			ArrayList<Integer> arr = new ArrayList<>();
			list.add(arr);
		}
		while (!queue.isEmpty()) {
			int poll = queue.poll();
			for (int j = 0; j < list.size(); j++) {
				boolean check = true;
				for (int i = 0; i < list.get(j).size(); i++) {
					if (poll < list.get(j).size()) {
						check = false;
						break;
					}
				}
				if (check == true) {
					list.get(j).add(0, poll);
					break;
				}
			}
		}
		for(int i = 0;i <list.size(); i++) {
			if(list.get(i).size() != 0) {
				count++;
			}
		}
		System.out.println(count);
	}
}
