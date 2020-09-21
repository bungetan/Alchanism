package Part1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;

public class C6051 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int num = Integer.parseInt(br.readLine());
		ArrayList<Stack<Integer>> list = new ArrayList<>();
		for (int i = 0; i < num + 1; i++) {
			Stack<Integer> temp = new Stack<>();
			list.add(temp);
		}
		int time = 0;
		for (int i = 1; i < num + 1; i++) {
			st = new StringTokenizer(br.readLine());
			String c = st.nextToken();
			if (c.equals("a")) {
				int number = Integer.parseInt(st.nextToken());
				list.get(time).add(number);
			} else if (c.equals("s")) {
				if (!list.get(time).empty()) {
					list.get(time).pop();
				}
			} else if (c.equals("t")) {
				int number = Integer.parseInt(st.nextToken());
				list.get(time).clear();
				for (int j = 0; j < list.get(number - 1).size(); j++) {
					list.get(time).add(list.get(number - 1).get(j));
				}
	
			}
			for (int j = 0; j < list.get(time).size(); j++) {
				list.get(i).add(list.get(time).get(j));
			}
			if (!list.get(time).empty()) {
				System.out.println(list.get(time).peek());
			} else {
				System.out.println(-1);
			}

		}
//		for (int i = 1; i < list.size(); i++) {
//			for (int j = 0; j < list.get(i).size(); j++) {
//				System.out.print(list.get(i).get(j) +" ");
//			}
//			System.out.println();
//		}

	}

}
