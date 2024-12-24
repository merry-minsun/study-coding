import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class TestDfsBfs {
	
	public static int N = 0;
	public static int L = 0;
	public static int SN = 0;
	public static int[][] arr;
	public static boolean[] visited;
	public static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		N = Integer.parseInt(st.nextToken());
		L = Integer.parseInt(st.nextToken());
		SN = Integer.parseInt(st.nextToken());
		
		arr = new int[N+1][N+1];
		
		for(int i = 0; i < L; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int v1 = Integer.parseInt(st.nextToken());
			int v2 = Integer.parseInt(st.nextToken());
			
			arr[v1][v2] = arr[v2][v1] = 1;
		}
		
		visited = new boolean[N+1];
		dfs(SN);
		sb.append("\n");
		Arrays.fill(visited, false);
		bfs(SN);
		
		System.out.println(sb);
		
	}
	
	public static void dfs(int N) {
		
		visited[N] = true;
		sb.append(N + " ");
		
		if(N == arr.length) {
			return;
		}
		
		for(int i = 1; i < L; i++) {
			if(arr[N][i] == 1 && visited[i] == false) {
				dfs(i);
			}
		}
	}
	
	public static void bfs(int N) {
		
		Queue<Integer> que = new LinkedList<Integer>();
		que.add(N);
		
		visited[N] = true;
		sb.append(N + " ");
		
		while(!que.isEmpty()) {
			
			int v = que.poll();
		
			for(int i = 1; i < L; i++) {
				
				if(arr[v][i] == 1 && visited[i] == false) {
					que.add(i);
					visited[i] = true;
					sb.append(i + " ");
				}
			}
		}
	}

}
