package SlidingWindow;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

public class junpingnumber {
		public void bfs(int x, int num)
		{
			Queue<Integer> q = new LinkedList<Integer>();
			q.add(num);
			while (!q.isEmpty()) {
				num = q.peek();
				q.poll();
				if (num <= x) {
					System.out.print(num + " ");
					int last_digit = num % 10;
					if (last_digit == 0) {
						q.add((num * 10) + (last_digit + 1));
					}
					else if (last_digit == 9) {
						q.add((num * 10) + (last_digit - 1));
					}
					else {
						q.add((num * 10) + (last_digit - 1));
						q.add((num * 10) + (last_digit + 1));
					}
				}
			}
		}
		public void printJumping(int x)
		{
			System.out.print("0 ");

			for (int i = 1; i <= 9 && i <= x; i++) {
				this.bfs(x, i);
			}
		}
		public static void main(String[] args) throws IOException
		{
			int x = 40;
			junpingnumber obj = new junpingnumber();
			obj.printJumping(x);
		}
}

