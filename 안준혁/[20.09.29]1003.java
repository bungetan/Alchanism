import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	static ArrayList<Integer> zero;
	static ArrayList<Integer> one;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		zero = new ArrayList<Integer>();
		one = new ArrayList<Integer>();
		zero.add(1);
		one.add(0);
		zero.add(0);
		one.add(1);
		for(int i=0; i < 39; i++) {
			zero.add(zero.get(i)+zero.get(i+1));
			one.add(one.get(i)+one.get(i+1));
		}
		int t = Integer.parseInt(bf.readLine());;
		int n;
		for(int i = 0; i < t; i++) {
			n = Integer.parseInt(bf.readLine());
			System.out.println(Integer.toString(zero.get(n)) +" "+ Integer.toString(one.get(n)));
		}
	}
}
