import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class BJ_1043_ing {

	public static void main(String[] args) throws IOException {
		
		int result = 0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int N = Integer.parseInt(st.nextToken()); // 사람의수
		int M = Integer.parseInt(st.nextToken()); // 파티의수
		
		result = M;
		
		st = new StringTokenizer(br.readLine(), " ");
		int T = Integer.parseInt(st.nextToken()); // 진실을아는사람수
		
		Map<Integer, Integer> TN = new HashMap(); // 진실을아는사람번호
		for(int x = 0; x < T; x++) {
			TN.put(Integer.parseInt(st.nextToken()), 0); 
		}
		
		if(T == 0) {
			System.out.println("\n" + M);
			return;
		}

		int[][] P = new int[M][]; // 파티별 진실을아는사람번호
		
		for(int k = 0; k < M; k++) { // 파티수
			st = new StringTokenizer(br.readLine());
			for(int l = 0; l < Integer.parseInt(st.nextToken()); l++) {
				P[k][l] = Integer.parseInt(st.nextToken());
			}
		}
		

		for(int y = 0; y < T; y++) { // 진실아는사람수
			for(int z = 0; z < M; z++) { // 파티수
				;
			}
		}
		

		for(int i = 0; i < M; i++) {
			boolean existYN = false;
			
			st = new StringTokenizer(br.readLine(), " ");
			
			int PN = Integer.parseInt(st.nextToken());
			
			for(int j = 0; j < PN; j++) {
				int PP = Integer.parseInt(st.nextToken());
				if(TN.containsKey(PP)) {
					existYN = true;
					result--;
					break;
				}else {
					TN.put(PP,0);
				}
			}
		}
		
		System.out.println(result);
	}
	

	
	
}
