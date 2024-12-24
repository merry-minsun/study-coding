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
		
		int N = Integer.parseInt(st.nextToken()); // ����Ǽ�
		int M = Integer.parseInt(st.nextToken()); // ��Ƽ�Ǽ�
		
		result = M;
		
		st = new StringTokenizer(br.readLine(), " ");
		int T = Integer.parseInt(st.nextToken()); // �������ƴ»����
		
		Map<Integer, Integer> TN = new HashMap(); // �������ƴ»����ȣ
		for(int x = 0; x < T; x++) {
			TN.put(Integer.parseInt(st.nextToken()), 0); 
		}
		
		if(T == 0) {
			System.out.println("\n" + M);
			return;
		}

		int[][] P = new int[M][]; // ��Ƽ�� �������ƴ»����ȣ
		
		for(int k = 0; k < M; k++) { // ��Ƽ��
			st = new StringTokenizer(br.readLine());
			for(int l = 0; l < Integer.parseInt(st.nextToken()); l++) {
				P[k][l] = Integer.parseInt(st.nextToken());
			}
		}
		

		for(int y = 0; y < T; y++) { // ���Ǿƴ»����
			for(int z = 0; z < M; z++) { // ��Ƽ��
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
