package Part1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class C1916 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int INF = Integer.MAX_VALUE;
		int V = Integer.parseInt(br.readLine());
		int E = Integer.parseInt(br.readLine());
		ArrayList<ArrayList<Dij>> list = new ArrayList<>();
		int[] min = new int[V+1];
		boolean[] check = new boolean[V+1];

		Arrays.fill(min, INF);

		for(int i = 0; i < V + 1; i++) {
			ArrayList<Dij> arr = new ArrayList<>();
			list.add(arr);
		}
		for(int i = 0; i< E; i++) {
			st = new StringTokenizer(br.readLine());
			int from = Integer.parseInt(st.nextToken());
			int to = Integer.parseInt(st.nextToken());
			int time = Integer.parseInt(st.nextToken());
			Dij d  = new Dij(to, time);
			list.get(from).add(d);
		}
		st = new StringTokenizer(br.readLine());
		int start = Integer.parseInt(st.nextToken());
		int ans = Integer.parseInt(st.nextToken());
		min[start] = 0;
		
		Queue<Dij> queue = new PriorityQueue<>();
		Dij str = new Dij(start , 0);
		queue.add(str);
		
		while(!queue.isEmpty()) {
			Dij alpha = queue.poll();
			int to = alpha.to;
			
			if(check[to] == true) {
				continue;
			}else {
				check[to] = true;
			}
			for(int i = 0; i<list.get(to).size(); i++) {
				Dij beta = list.get(to).get(i);
				if(min[beta.to]> min[to] + beta.time) {
					min[beta.to] = min[to] + beta.time;
					Dij n = new Dij(beta.to, min[beta.to]);
					queue.add(n);
				}
			}
		}
		System.out.println(min[ans]);
	}
}
//class Dij implements Comparable<Dij>{
//	int to;
//	int time;
//	public Dij(int to, int time) {
//		this.to = to;
//		this.time = time;
//	}
//	@Override
//	public int compareTo(Dij d) {
//		return time - d.time;
//	}
//}
	
