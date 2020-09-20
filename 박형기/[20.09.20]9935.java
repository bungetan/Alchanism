package Part1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class C9935 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String list = br.readLine();
		String bomb = br.readLine();
		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < list.length(); i++) {
			stack.add(list.charAt(i));
			if (stack.peek().equals(bomb.charAt(bomb.length() - 1))) {
				int a = 0;
				StringBuffer sb = new StringBuffer();
				boolean check = true;
				for (int j = bomb.length() - 1; j >= 0; j--) {
					if (!stack.empty()) {
						if (stack.peek() == bomb.charAt(j)) {
							sb.append(stack.pop());
							continue;
						} else {
							check = false;
						}
					}else {
						if(sb.length() == bomb.length()) {
							check = true;
							break;
						}else {
							check = false;
							break;
						}
					}
				}
				if (check == false) {
					sb.reverse();
					for(int k = 0 ;k < sb.length(); k++) {
						stack.add(sb.charAt(k));
					}
				}
				check = true;
			}

		}

		StringBuffer answer = new StringBuffer();
		while (!stack.isEmpty()) {
			answer.append(stack.pop());
		}
		if (answer.length() == 0) {
			System.out.println("FRULA");
		} else {
			System.out.println(answer.reverse());
		}
	}

}
