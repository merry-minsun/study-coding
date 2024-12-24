import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BJ_1956 {
	public static void main(String[] args) throws IOException {
	
	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
	
	int V = Integer.parseInt(st.nextToken());
	int E = Integer.parseInt(st.nextToken());
	
	int[][] arr = new int[E][3];
	for(int i = 0; i < E; i++) {
		st = new StringTokenizer(bf.readLine(), " ");
		for(int j = 0; j < 3; j++) {
			arr[i][j] = Integer.parseInt(st.nextToken()); 
		}
	}
	
	// ???
	
	
	}
}
