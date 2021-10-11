import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] picture = new int[101][101];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int leftX = Integer.parseInt(st.nextToken());
            int leftY = Integer.parseInt(st.nextToken());
            int rightX = Integer.parseInt(st.nextToken());
            int rightY = Integer.parseInt(st.nextToken());

            for (int j = leftX; j <= rightX; j++)
                for (int k = leftY; k <= rightY; k++)
                    picture[j][k]++;

        }
        int cnt = 0;
        for (int i = 1; i < picture.length; i++) {
            for (int j = 1; j < picture[i].length; j++)
                if (picture[i][j] > m)
                    cnt++;
        }
        System.out.println(cnt);
    }
}
