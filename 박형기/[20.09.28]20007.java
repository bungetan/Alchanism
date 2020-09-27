import java.io.BufferedReader;


import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class G {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int INF = Integer.MAX_VALUE;
		int V = Integer.parseInt(st.nextToken());
		int E = Integer.parseInt(st.nextToken());
		int move = Integer.parseInt(st.nextToken());
		int start = Integer.parseInt(st.nextToken());
		ArrayList<ArrayList<Dij>> list = new ArrayList<>();
		int[] min = new int[V];
		boolean[] check = new boolean[V];
		Arrays.fill(min, INF);
		min[start] = 0;
		for(int i = 0; i < V; i++) {
			ArrayList<Dij> arr = new ArrayList<>();
			list.add(arr);
		}
		for(int i = 0; i< E; i++) {
			st = new StringTokenizer(br.readLine());
			int from = Integer.parseInt(st.nextToken());
			int to = Integer.parseInt(st.nextToken());
			int time = Integer.parseInt(st.nextToken());
			Dij d  = new Dij(to, time);
			Dij d2  = new Dij(from, time);
			list.get(from).add(d);
			list.get(to).add(d2);
		}
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
		boolean checking = true;
		int leftmove = move;
		int count = 0;
		Arrays.sort(min);
		for(int i = 0 ;i<min.length ; i++) {
			if(min[i] == Integer.MAX_VALUE) {
				checking = false;
				break;
			}else {
				if(min[i] * 2 > leftmove) {
					if(leftmove == move) {
						checking = false;
						break;
					}
					count++;
					leftmove = move;
					leftmove -= min[i] * 2;
					if(leftmove < 0 ) {
						checking = false;
						break;
					}
				}else {
					leftmove -= min[i] * 2;
				}
			}
		}
		if(checking == true) {
			System.out.println(count + 1);
		}else {
			System.out.println(-1);
		}
	}
}
class Dij implements Comparable<Dij>{
	int to;
	int time;
	public Dij(int to, int time) {
		this.to = to;
		this.time = time;
	}
	@Override
	public int compareTo(Dij d) {
		return time - d.time;
	}
}
